import java.util.Objects;

public class DCT extends DiscreteTransform {
    private  double[] output = new  double[6];

    public DCT(String filename){
        super.filename = filename;
    }

    @Override
    public void transformNumbers() {
        solveDCT(array);
    }

    private void solveDCT(double[] inputReel) {

        double x = 3.14159265358979323846 / inputReel.length;

        for (int i = 0; i < inputReel.length; i++) {

            double total = 0;

            for (int j = 0; j < inputReel.length; j++) {
                total += inputReel[j] * Math.cos((j + 0.5) * i * x);
            }
            output[i] = total;
        }

    }

    @Override
    public void printConsole() { /*do nothing*/ }

    public String toString(){
        String str = "Output:  ";
        for (int i = 0; i < output.length; i++) {
            str += output[i] + " ";
        }
        str += "\n";
        return str;
    }
}
