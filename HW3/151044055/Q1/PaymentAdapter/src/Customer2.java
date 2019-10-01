public class Customer2 implements TurboPayment {
    /**
     * Implements the payInTurbo method to show that it pay it in TurboPayment.
     * @param turboCardNo
     * @param turboAmount
     * @param destinationTurboOfCourse
     * @param installmentsButInTurbo
     * @return
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        System.out.println
                ("Customer2 is paid as the TurboPayment, Info:\nCard No: " +
                        turboCardNo + "\nAmount: " + turboAmount + "\nDestination: " +
                        destinationTurboOfCourse + "\nInstallments: " + installmentsButInTurbo + "\n");
        return 0;
    }
}
