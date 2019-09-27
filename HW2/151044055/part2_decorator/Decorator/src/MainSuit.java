public class MainSuit {
    public static void main(String[] args) {
        Suit suit = new Dec();
        System.out.println(suit.getSuitName() + " " + suit.totalCost() + "TL, " + suit.totalWeight() + "kg.");

        Suit suit2 = new Ora();
        suit2 = new AutoRifle(suit2);
        suit2 = new FlameThrower(suit2);
        suit2 = new FlameThrower(suit2);
        System.out.println(suit2.getSuitName() + " " + suit2.totalCost() + "TL, " + suit2.totalWeight() + "kg.");

        Suit suit3 = new Tor();
        suit3 = new Laser(suit3);
        suit3 = new RocketLauncher(suit3);
        suit3 = new FlameThrower(suit3);
        suit3 = new AutoRifle(suit3);
        System.out.println(suit3.getSuitName() + " " + suit3.totalCost() + "TL, " + suit3.totalWeight() + "kg.");
    }
}
