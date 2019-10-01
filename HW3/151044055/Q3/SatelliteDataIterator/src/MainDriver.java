public class MainDriver {
    public static void main(String[] args) {
        Integer data[][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}
        };
        SatelliteDataClockwise satelliteDataClockwise = new SatelliteDataClockwise(data);
        SatelliteDataAntiClockwise satelliteDataAntiClockwise = new SatelliteDataAntiClockwise(data);

        SatelliteDataPrinter satelliteDataPrinter = new SatelliteDataPrinter(satelliteDataClockwise, satelliteDataAntiClockwise);
        satelliteDataPrinter.printData();
    }
}
