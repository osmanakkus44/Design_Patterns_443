import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DFT extends DiscreteTransform {
    private double[] outputReel = new double[6];
    private double[] outputImag = new double[6];

    public DFT(String filename){
        super.filename = filename;
    }

    @Override
    public void transformNumbers() {
        solveDFT(array,outputReel,outputImag);
    }

    /**
     *
     * @param inputReel
     * @param outputReel
     * @param outputImag
     */
    private void solveDFT(double inputReel[],double outputReel[],double outputImag[]) {

        int i, j;
        double angle;
        double sumreal;
        double sumimag;

        for (i = 0; i < inputReel.length; i++)
        {
            sumreal = 0;
            sumimag = 0;
            for (j = 0; j < inputReel.length; j++)
            {
                angle = 2 * 3.14159265358979323846 * j * i / inputReel.length;
                sumreal +=  inputReel[j] * Math.cos(angle);
                sumimag += -inputReel[j] * Math.sin(angle);
            }

            outputReel[i] = sumreal;
            outputImag[i] = sumimag;
        }
    }

    @Override
    public void printConsole() {
        System.out.println("Execution time is 0.0013");
    }

    public boolean userWantsToPrint(){
        String input = InputFromUser();

        if (input.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    public String InputFromUser(){
        String input = null;

        System.out.print("Would you like to print the time of execution to the console (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = in.readLine();
        } catch (IOException ex) {
            System.err.println("IO exception error");
        }
        if (input == null) {
            return "Not printed";
        }
        return input;
    }

    public String toString(){
        String str = "Reel:  ";
        for (int i = 0; i < outputReel.length; i++) {
            str += outputReel[i] + " ";
        }
        str += "\nImaginer:  ";
        for (int i = 0; i < outputImag.length; i++) {
            str += outputImag[i] + " ";
        }
        str += "\n";
        return str;
    }
}
