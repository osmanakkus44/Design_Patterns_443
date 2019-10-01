import java.util.ArrayList;
import java.util.Iterator;

public class SatelliteDataClockwiseIterator implements Iterator<Integer> {
    private ArrayList<Integer> list;

    private Integer[][] data;
    private int row;
    private int col;
    private int height;
    private int width;
    private int current;

    public SatelliteDataClockwiseIterator(Integer[][] data){
        list = new ArrayList<>();
        this.data = data;
        width = height = this.data.length;
        row = col = current = 0;
        clockwiseTraverse();
    }

    @Override
    public boolean hasNext() {
        return current < list.size();
    }

    @Override
    public Integer next() {
        return list.get(current++);
    }

    private void clockwiseTraverse(){
        while(row < width && col < height){
            for (int index = col; index < height; index++) {
                list.add(data[row][index]);
            }
            row++;

            for (int index = row; index < width; index++) {
                list.add(data[index][height-1]);
            }
            height--;

            if(row < width){
                for (int index = height -1; index >= col; index--) {
                    list.add(data[width-1][index]);
                }
                width--;
            }

            if(col < height){
                for (int index = width-1; index >= row; index--) {
                    list.add(data[index][col]);
                }
                col++;
            }
        }
    }
}
