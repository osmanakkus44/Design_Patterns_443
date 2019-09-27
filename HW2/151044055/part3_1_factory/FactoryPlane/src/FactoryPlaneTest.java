public class FactoryPlaneTest {
    public static void main(String[] args) {
        PlaneManufacturer tpxPlaneManufacturer = new TPXPlaneManufacturer();

        Plane plane = tpxPlaneManufacturer.startConstructing("tpx100");
        System.out.println(plane.getModel() + " model plane constructed");

        plane = tpxPlaneManufacturer.startConstructing("tpx200");
        System.out.println(plane.getModel() + " model plane constructed");

        plane = tpxPlaneManufacturer.startConstructing("tpx300");
        System.out.println(plane.getModel() + " model plane constructed");

    }
}
