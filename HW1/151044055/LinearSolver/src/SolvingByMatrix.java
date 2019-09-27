/**
 * This class implements SolvingBehaviour class and it solves the linear
 * equations using the matrix technique
 * @author Osman Akkus
 */
public class SolvingByMatrix implements SolvingBehaviour {

    /**
     * @param coefficentMatrix two dimensional matrix to be solved
     * @param valueMatrix a matrix which involves the values of coefficient matrix
     * @return String
     */
    @Override
    public double[] solve(double[][] coefficentMatrix, double[] valueMatrix) {
        double[][] inversedMatrix = getInverseOfMatrix(coefficentMatrix);
        double[] result = multiplyMatrix(inversedMatrix, valueMatrix);
        return result;
    }

    /**
     *
     * @param mtrx two dimensional matrix to be solved
     * @param r indicates row
     * @param c indicates column
     * @return
     */
    private static double[][] getMinor(double[][] mtrx, int r, int c) {
        double[][] minorResult = new double[mtrx.length - 1][mtrx.length - 1];

        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; i != r && j < mtrx[i].length; j++) {
                if (j != c) {
                    minorResult[i < r ? i : i - 1][j < c ? j : j - 1] = mtrx[i][j];
                }
            }
        }
        return minorResult;
    }

    /**
     *
     * @param mtrx two dimensional matrix to be solved
     * @return determinant result
     */
    private double getDeterminantOfTheMatrix(double[][] mtrx) {
        double detResult = 0;

        if (mtrx.length != mtrx[0].length) {
            throw new IllegalStateException("wrong input for dimensions");
        }

        if (mtrx.length == 2) {
            return mtrx[0][0] * mtrx[1][1] - mtrx[0][1] * mtrx[1][0];
        }

        for (int i = 0; i < mtrx[0].length; i++) {
            detResult += Math.pow(-1, i) * mtrx[0][i]
                    * getDeterminantOfTheMatrix(getMinor(mtrx, 0, i));
        }
        return detResult;
    }

    /**
     *
     * @param mtrx two dimensional matrix to be solved
     * @return inversed matrix array
     */
    private double[][] getInverseOfMatrix(double[][] mtrx) {
        double[][] inversedMatrix = new double[mtrx.length][mtrx.length];

        for (int j = 0; j < mtrx.length; j++) {
            for (int k = 0; k < mtrx[j].length; k++) {
                inversedMatrix[j][k] = Math.pow(-1, j + k)
                        * getDeterminantOfTheMatrix(getMinor(mtrx, j, k));
            }
        }

        double determinantResult = 1.000 / getDeterminantOfTheMatrix(mtrx);

        for (int j = 0; j < inversedMatrix.length; j++) {
            for (int k = 0; k <= j; k++) {
                double temporary = inversedMatrix[j][k];
                inversedMatrix[j][k] = inversedMatrix[k][j] * determinantResult;
                inversedMatrix[k][j] = temporary * determinantResult;
            }
        }

        return inversedMatrix;
    }

    /**
     *
     * @param inversedMatrix inversed matrix
     * @param valueMatrix a matrix which involves the values of coefficient matrix
     * @return result matrix to be displayed
     */
    private double[] multiplyMatrix(double[][] inversedMatrix, double[] valueMatrix) {
        double[] result = new double[valueMatrix.length];

        for (int i = 0; i < valueMatrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < inversedMatrix[i].length; j++) {
                sum += inversedMatrix[i][j] * valueMatrix[j];
            }
            result[i] = sum;
        }

        return result;
    }

}