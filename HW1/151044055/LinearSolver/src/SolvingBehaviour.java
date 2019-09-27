/**
 * This is the SolvingBehaviour interface provides us to inform the class
 * will be implement this interface to  should implement the solve method.
 * The classes implements this interface will oniy implement the solve method
 * Then when the new method is added  provides the develepor use this solve methods
 * implemantations without implement again.
 * @author Osman Akkus
 */
public interface SolvingBehaviour {
    double [] solve(double[][] A, double[] B);
}
