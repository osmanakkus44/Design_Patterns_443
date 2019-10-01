public  abstract class DiscreteTransform {
    protected String filename;
    protected double array[] = new double[6];

    /**
     *
     */
    final void calculateDiscreteTransform(){
        readFromFile();
        transformNumbers();
        writeNumbers();
        if(userWantsToPrint()){
            printConsole();
        }
    }

    /**
     *
     */
    void readFromFile(){
        array[0] = 1.2;
        array[1] = 3.6;
        array[2] = 7.7;
        array[3] = 8.1;
        array[4] = 5.3;
        array[5] = 2.4;
    }

    abstract void transformNumbers();

    abstract void printConsole();


    void writeNumbers(){
        System.out.println("Numbers Written to output.txt....");
    }

    boolean userWantsToPrint(){
        return false;
    }
}
