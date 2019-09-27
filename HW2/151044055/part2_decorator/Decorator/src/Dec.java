/**
 *This is Dec suit class
 */
public class Dec extends Suit{

    /**
     *
     */
    public Dec(){
        suitName = "Dec ";
    }

    /**
     *  It returns cost of the Dec
     * @return cost
     */
    @Override
    public double totalCost() {
        return 500.0;
    }

    /**
     *  It returns weight of the Dec
     * @return weight
     */
    @Override
    public double totalWeight() {
        return 25.0;
    }
}
