/**
 *
 */
public interface TurboPayment {
    /**
     *
     * @param turboCardNo
     * @param turboAmount
     * @param destinationTurboOfCourse
     * @param installmentsButInTurbo
     * @return
     */
    int payInTurbo(String turboCardNo, float turboAmount,
                   String destinationTurboOfCourse, String installmentsButInTurbo);
}
