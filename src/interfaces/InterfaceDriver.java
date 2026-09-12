package interfaces;

import java.util.ArrayList;

public class InterfaceDriver {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer("Alex", "Rivera", 45, 38));
        payables.add(new Freelancer("Jordan", "Lee", 60, 46));
        payables.add(new VendorInvoice("Acme Supplies", "INV-1001", 1250.50));
        payables.add(new VendorInvoice("Globex Corp", "INV-1002", 3800));

        double total = 0;
        for (Payable p : payables) {
            if (p instanceof Freelancer f) {
                f.print();
            } else if (p instanceof VendorInvoice v) {
                v.print();
            }
            total += p.calculatePayment();
        }

        System.out.println("Total payout: $" + total);
    }
}
