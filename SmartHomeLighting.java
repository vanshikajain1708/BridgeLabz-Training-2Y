public class SmartHomeLighting {
    public static void main(String[] args) {
        Runnable motionTrigger = () -> System.out.println("Lights ON due to motion");
        Runnable timeTrigger = () -> System.out.println("Lights DIM at night");
        Runnable voiceTrigger = () -> System.out.println("Lights set to party mode");
        motionTrigger.run();
        timeTrigger.run();
        voiceTrigger.run();
    }
}
