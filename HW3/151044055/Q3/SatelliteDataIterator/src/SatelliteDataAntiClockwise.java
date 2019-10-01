public class SatelliteDataAntiClockwise implements SatelliteData{

    private Integer[][] data;

    public SatelliteDataAntiClockwise(){
        data = new Integer[10][10];
    }

    public SatelliteDataAntiClockwise(Integer[][] data){
        this.data = new Integer[data.length][data.length];
        this.data = data;
    }

    public SatelliteDataAntiClockwiseIterator createIterator(){
        return new SatelliteDataAntiClockwiseIterator(data);
    }
}
