/**
 *  This class uses the behaviour of elimination to solve the linear
 *  equations.
 * @author Osman Akkus
 */
public class GaussianElimination extends Solver{

    /**
     * It instantiate the solvingBehaviour with SolvingByElimination
     * class to perform the solving elimination method.
     */
    public GaussianElimination(){
        solvingBehaviour = new SolvingByElimination();
    }

    /**
     *
     * @param coefficientMatrix two dimensional matrix to be solved
     * @param valuesMatrix a matrix which involves the values of coefficient matrix
     * @return
     */
    @Override
    public double[] showRes(double[][] coefficientMatrix, double[] valuesMatrix) {
        return performSolving(coefficientMatrix,valuesMatrix);
    }

}
