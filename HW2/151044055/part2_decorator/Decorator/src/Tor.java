/**
 *This is Tor suit class
 */
public class Tor extends Suit{

    /**
     * Tor constructor to assign its name
     */
    public Tor(){
        suitName = "Tor ";
    }

    /**
     *
     * @return
     */
    @Override
    public double totalCost() {
        return 5000.0;
    }

    /**
     *
     * @return
     */
    @Override
    public double totalWeight() {
        return 50.0;
    }
}
