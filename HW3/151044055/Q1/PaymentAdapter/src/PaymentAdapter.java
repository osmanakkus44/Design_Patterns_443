/**
 * This is an adapter class which will help the ModernPayment class to adapt itself with respect to the
 * TurboPayment
 */
public  class PaymentAdapter implements TurboPayment{
    private ModernPayment modernPayment;

    /**
     *
     * @param modernPayment
     */
    public PaymentAdapter(ModernPayment modernPayment){
        this.modernPayment = modernPayment;
    }

    /**
     *This method calls ModernPayment's pay method because it wants to perform payment as a ModernPayment
     * even if given to the TurboPayment's payInTurbo method.
     * @param turboCardNo
     * @param turboAmount
     * @param destinationTurboOfCourse
     * @param installmentsButInTurbo
     * @return
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        return modernPayment.pay(turboCardNo, turboAmount, destinationTurboOfCourse, installmentsButInTurbo);
    }
}
