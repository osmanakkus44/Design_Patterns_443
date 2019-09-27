/**
 *This class uses the behaviour of matrix inversion to solve the linear
 * equations.
 * @author Osman Akkus
 */
public class MatrixInversion extends Solver{

    /**
     * It instantiate the solvingBehaviour with SolvingByMatrix
     * class to perform the solving elimination method.
     */
    public MatrixInversion(){
        solvingBehaviour = new SolvingByMatrix();
    }

    /**
     * @param coefficientMatrix two dimensional matrix to be solved
     * @param valuesMatrix a matrix which involves the values of coefficient matrix
     * @return
     */
    @Override
    public double[] showRes(double[][]coefficientMatrix , double[] valuesMatrix) {
        return performSolving(coefficientMatrix,valuesMatrix);
    }

}
