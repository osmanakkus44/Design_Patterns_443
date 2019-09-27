public abstract class PlaneManufacturer {

    public abstract Plane constructPlane(String item);

    public Plane startConstructing(String type) {
        Plane plane = constructPlane(type);
        System.out.println("--- Making a " + plane.getModel() + " ---");
        plane.manufacturing();
        plane.constructSkeleton();
        plane.placeEngines();
        plane.placeSeats();
        return plane;
    }
}
