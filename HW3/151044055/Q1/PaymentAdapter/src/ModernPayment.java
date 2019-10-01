/**
 *
 */
public interface ModernPayment {
    /**
     *
     * @param cardNo
     * @param amount
     * @param destination
     * @param installments
     * @return
     */
    int pay(String cardNo, float amount, String destination, String installments);
}
