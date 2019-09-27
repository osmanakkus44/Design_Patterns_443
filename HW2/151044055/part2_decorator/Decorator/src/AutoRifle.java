/**
 * This is AutoRifle accessories class
 */
public class AutoRifle extends SuitDecorator{
    /**
     *  Constructor takes Suit type and assign it to its own suit
     * @param suit
     */
    public AutoRifle(Suit suit){
        this.suit = suit;
    }
    /**
     * Overridden method to get concaneted suitname
     * @return concaneted suitname
     */
    @Override
    public String getSuitName() {
        return suit.getSuitName() + "with AutoRifle ";
    }

    /**
     * Overridden method to get concat cost
     * @return concat cost
     */
    @Override
    public double totalCost() {
        return suit.totalCost() + 30.0;
    }

    /**
     *Overridden method to get concat weight
     * @return concat weight
     */
    @Override
    public double totalWeight() {
        return suit.totalWeight() + 1.5;
    }

}
