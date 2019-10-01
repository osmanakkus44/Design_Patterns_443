import java.util.Iterator;

/**
 * This class will help to perform the printing process of the satellite data
 * using two different way. But this class never be aware on that because it will be doing always same thing.
 * (Make same role as Waitress example in the book.)
 */
public class SatelliteDataPrinter {
    private SatelliteData clockwise;
    private SatelliteData antiClockwise;

    public SatelliteDataPrinter(SatelliteData clockwise, SatelliteData antiClockwise){
        this.clockwise = clockwise;
        this.antiClockwise = antiClockwise;
    }

    public void printData(){
        Iterator<Integer> clockwiseIterator = clockwise.createIterator();
        //Iterator<Integer> antiClockwiseIterator = antiClockwise.createIterator();

        System.out.println("ClockWise print the Data");
        printData(clockwiseIterator);
        //System.out.println("AntiClockWise print the Data");
        //printData(antiClockwiseIterator);

    }

    public void printData(Iterator<Integer> iterator){
        while(iterator.hasNext()){
            Integer item = iterator.next();
            System.out.print(item);
            if (iterator.hasNext()){
                System.out.print(" ");
            }
        }
    }

}
