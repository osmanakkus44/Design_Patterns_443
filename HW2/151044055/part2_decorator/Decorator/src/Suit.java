/**
 *
 */
public abstract class Suit {
    protected String suitName = "Unknown Suit Name";

    public String getSuitName(){return suitName;}
    public abstract double totalCost();
    public abstract double totalWeight();
}