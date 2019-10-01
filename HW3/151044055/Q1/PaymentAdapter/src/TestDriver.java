/**
 *
 */
public class TestDriver {
    public static void main(String[] args) {
        ModernPayment customer1 = new Customer1();

        TurboPayment customerTurbo1 = new PaymentAdapter(customer1);

        TurboPayment customerTurbo2 = new Customer2();

        System.out.println("All about the Customer1: \n");
        testPayments(customerTurbo1);
        System.out.println("All about the Customer2: \n");
        testPayments(customerTurbo2);
    }

    /**
     * This is a polymorphic method to show the different results according to the given different
     * two objects
     * @param turboPayment
     */
    static void testPayments(TurboPayment turboPayment){
        turboPayment.payInTurbo("712924973", 1250000,
                "BankOfChicago", "BankOfNY");
    }
}
