public abstract class Plane {
    String model;
    String skeleton;
    String engine;
    String seating;
    String purpose;

    void manufacturing() {
        System.out.println("Manufacturing " + model);
        System.out.println("Constructing skeleton...");
        System.out.println("Placing engines...");
        System.out.println("Placing seats...");
    }

    void constructSkeleton() {
        System.out.println("Skeleton is constructing");
    }

    void placeEngines() {
        System.out.println("Placing the engines of the plane");
    }

    void placeSeats(){
        System.out.println("Placing the seats of the plane");
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        String display = "   " + model + "   \n" + skeleton + "\n" + engine + "\n" + seating + "\n" + purpose;
        return display;
    }
}



