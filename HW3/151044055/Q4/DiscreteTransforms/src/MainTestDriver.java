public class MainTestDriver {
    public static void main(String[] args) {
        String filename = "example.txt";

        DCT dct = new DCT(filename);
        DFT dft = new DFT(filename);

        System.out.println("Calculating for DCT");
        dct.calculateDiscreteTransform();
        System.out.println(dct);

        System.out.println("Calculating for DFT");
        dft.calculateDiscreteTransform();
        System.out.println(dft);
    }
}
