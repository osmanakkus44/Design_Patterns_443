public class SatelliteDataClockwise implements SatelliteData{
    private Integer[][] data;

    public SatelliteDataClockwise(){
        data = new Integer[10][10];
    }

    public  SatelliteDataClockwise(Integer[][] data){
        this.data = new Integer[data.length][data.length];
        this.data = data;
    }
    /**
     *
     * @return an Iterator to iterate over the satellite data as we want easily.
     */
    public SatelliteDataClockwiseIterator createIterator(){
        return  new SatelliteDataClockwiseIterator(data);
    }
}
