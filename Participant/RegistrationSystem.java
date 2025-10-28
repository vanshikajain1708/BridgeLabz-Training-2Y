import java.util.*;
class Participant<T> {
    private final int rollNumber;
    private final String name;
    private final T branch;

    public Participant(int rollNumber, String name, T branch) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public T getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", branch=" + branch +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participant<?>)) return false;
        Participant<?> that = (Participant<?>) o;
        return rollNumber == that.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }
}

public class RegistrationSystem<T> {
    private final int capacity;
    private final List<Participant<T>> registeredList;
    private final LinkedList<Participant<T>> waitingList;
    private final Set<Integer> rollNumberSet;

    public RegistrationSystem(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        registeredList = new ArrayList<>();
        waitingList = new LinkedList<>();
        rollNumberSet = new HashSet<>();
    }

    public boolean registerParticipant(Participant<T> participant) {
        if (rollNumberSet.contains(participant.getRollNumber())) {
            System.out.println("Registration failed: duplicate roll number " + participant.getRollNumber());
            return false;
        }
        rollNumberSet.add(participant.getRollNumber());
        if (registeredList.size() < capacity) {
            registeredList.add(participant);
            System.out.println("Registered: " + participant);
        } else {
            waitingList.add(participant);
            System.out.println("Waiting list: " + participant);
        }
        return true;
    }

    public boolean cancelRegistration(int rollNumber) {
        Participant<T> removed = null;
        Iterator<Participant<T>> it = registeredList.iterator();
        while (it.hasNext()) {
            Participant<T> p = it.next();
            if (p.getRollNumber() == rollNumber) {
                removed = p;
                it.remove();
                break;
            }
        }
        if (removed == null) {
            System.out.println("Cancel failed: no registered participant with roll number " + rollNumber);
            return false;
        }
        System.out.println("Cancelled registration for: " + removed);
        rollNumberSet.remove(rollNumber);
        if (!waitingList.isEmpty()) {
            Participant<T> nextUp = waitingList.removeFirst();
            registeredList.add(nextUp);
            rollNumberSet.add(nextUp.getRollNumber());
            System.out.println("Moved from waiting to registered: " + nextUp);
        }
        return true;
    }
    public void displayRegistered() {
        System.out.println("=== Registered Participants ===");
        if (registeredList.isEmpty()) {
            System.out.println("(none)");
        } else {
            for (Participant<T> p : registeredList) {
                System.out.println(p);
            }
        }
    }

    public void displayWaitingList() {
        System.out.println("=== Waiting List ===");
        if (waitingList.isEmpty()) {
            System.out.println("(none)");
        } else {
            for (Participant<T> p : waitingList) {
                System.out.println(p);
            }
        }
    }
    public static void main(String[] args) {
        RegistrationSystem<String> system = new RegistrationSystem<>(3);

        system.registerParticipant(new Participant<>(101, "Alice", "CS"));
        system.registerParticipant(new Participant<>(102, "Bob", "EE"));
        system.registerParticipant(new Participant<>(103, "Charlie", "ME"));
        system.registerParticipant(new Participant<>(104, "Diana", "CS"));  
        system.registerParticipant(new Participant<>(102, "Eve", "CE"));    

        system.displayRegistered();
        system.displayWaitingList();

        system.cancelRegistration(102);
        system.displayRegistered();
        system.displayWaitingList();
    }
}
