import java.util.*;
class Invoice {
    int id;
    Invoice(int id) {
        this.id = id;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {
        List<Integer> transactionIDs = Arrays.asList(1, 2, 3, 4);
        List<Invoice> invoices = transactionIDs.stream().map(Invoice::new).toList();
        invoices.forEach(i -> System.out.println("Invoice ID: " + i.id));
    }
}
