/**
 * This class implements SolvingBehaviour class and it solves the linear
 * equations using the elimination technique
 * @author Osman Akkus
 */
public class SolvingByElimination implements SolvingBehaviour {

    /**
     *
     * @param coefficientMatrix two dimensional matrix to be solved
     * @param valuesMatrix a matrix which involves the values of coefficient matrix
     * @return String
     */
    @Override
    public double[] solve(double[][] coefficientMatrix, double[] valuesMatrix) {
        int lengthOfvalues = valuesMatrix.length;

        for (int l = 0; l < lengthOfvalues; l++) {
            int maxValue = l;
            for (int i = l + 1; i < lengthOfvalues; i++) {
                if (Math.abs(coefficientMatrix[i][l]) > Math.abs(coefficientMatrix[maxValue][l])) {
                    maxValue = i;
                }
            }
            double[] temporary = coefficientMatrix[l];
            coefficientMatrix[l] = coefficientMatrix[maxValue];
            coefficientMatrix[maxValue] = temporary;
            double t = valuesMatrix[l];
            valuesMatrix[l] = valuesMatrix[maxValue];
            valuesMatrix[maxValue] = t;

            if (Math.abs(coefficientMatrix[l][l]) <= EPSILON_VALUE) {
                throw new ArithmeticException("Error Arithmetic Exception");
            }

            for (int i = l + 1; i < lengthOfvalues; i++) {
                double aValue = coefficientMatrix[i][l] / coefficientMatrix[l][l];
                valuesMatrix[i] -= aValue * valuesMatrix[l];
                for (int j = l; j < lengthOfvalues; j++) {
                    coefficientMatrix[i][j] -= aValue * coefficientMatrix[l][j];
                }
            }
        }

        double[] result = new double[lengthOfvalues];
        for (int i = lengthOfvalues - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < lengthOfvalues; j++) {
                sum += coefficientMatrix[i][j] * result[j];
            }
            result[i] = (valuesMatrix[i] - sum) / coefficientMatrix[i][i];
        }
        return result;
    }

    private static final double EPSILON_VALUE = 1e-10;
}