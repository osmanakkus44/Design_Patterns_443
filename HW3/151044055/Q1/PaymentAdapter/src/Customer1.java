public class Customer1 implements ModernPayment{

    /**
     * Implements the pay method to show that it pay it in ModernPayment.
     * @param cardNo
     * @param amount
     * @param destination
     * @param installments
     * @return
     */
    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
        System.out.println
                ("Customer1 is paid as the ModernPayment, Info:\nCard No: " +
                cardNo + "\nAmount: " + amount + "\nDestination: " +
                destination + "\nInstallments: " + installments + "\n");
        return 0;
    }
}
