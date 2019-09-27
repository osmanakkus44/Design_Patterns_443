/**
 * This is RocketLauncher accessories class
 */
public class RocketLauncher extends SuitDecorator{
    /**
     *  Constructor takes Suit type and assign it to its own suit
     * @param suit
     */
    public RocketLauncher(Suit suit){
        this.suit = suit;
    }

    /**
     * Overridden method to get concaneted suitname
     * @return concaneted suitname
     */
    @Override
    public String getSuitName() {
        return suit.getSuitName() + "with RocketLauncher ";
    }

    /**
     * Overridden method to get concat cost
     * @return concat cost
     */
    @Override
    public double totalCost() {
        return suit.totalCost() + 150.0;
    }

    /**
     *Overridden method to get concat weight
     * @return concat weight
     */
    @Override
    public double totalWeight() {
        return suit.totalWeight() + 7.5;
    }

}
