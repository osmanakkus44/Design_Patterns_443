/**
 * Suit Decorator is an abstract class which helps us when we want to add a new material to the suit.
 * All materials which are accessories must extend from this abstract class
 */
public abstract class SuitDecorator extends Suit{
    Suit suit;
    public abstract String getSuitName();
}
