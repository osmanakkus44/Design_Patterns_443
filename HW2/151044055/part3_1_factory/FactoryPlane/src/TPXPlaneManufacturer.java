public class TPXPlaneManufacturer extends PlaneManufacturer {

    @Override
    public Plane constructPlane(String item) {
        if (item.equals("tpx100")) {
            return new TPX100();
        } else if (item.equals("tpx200")) {
            return new TPX200();
        } else if (item.equals("tpx300")) {
            return new TPX300();
        } else return null;
    }

}
