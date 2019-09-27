/**
 * An abstract class which has a SolvingBehaviour data member and has two methods.
 * performSolving --> polymorphic method which calls SolvingBehaviour data member's
 * solve method
 * @author Osman Akkus
 */
public abstract class Solver {
    protected SolvingBehaviour solvingBehaviour;

    protected double[] performSolving(double[][]A , double[] B){
        return solvingBehaviour.solve(A ,B);
    }

    public abstract double[] showRes(double[][]A , double[] B);
}
