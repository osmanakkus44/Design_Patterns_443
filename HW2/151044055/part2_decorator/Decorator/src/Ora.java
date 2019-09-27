/**
 * This is Ora suit class
 */
public class Ora extends Suit {
    /**
     *
     */
    public Ora(){
        suitName = "Ora ";
    }

    /**
     *
     * @return
     */
    @Override
    public double totalCost() {
        return 1500.0;
    }

    /**
     *
     * @return
     */
    @Override
    public double totalWeight() {
        return 30.0;
    }
}
