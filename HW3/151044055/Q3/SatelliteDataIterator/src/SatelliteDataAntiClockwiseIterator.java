import java.util.Iterator;

public class SatelliteDataAntiClockwiseIterator implements Iterator<Integer> {

    private Integer[][] data;



    public SatelliteDataAntiClockwiseIterator(Integer[][] data){
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next(){
        return null;
    }

}
