public class Que2 {
    public static int maxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int result = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sum1 += X[i];
                i++;
            } else if (X[i] > Y[j]) {
                sum2 += Y[j];
                j++;
            } else { 
                result += Math.max(sum1, sum2) + X[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < m) {
            sum1 += X[i];
            i++;
        }

        while (j < n) {
            sum2 += Y[j];
            j++;
        }

        result += Math.max(sum1, sum2);

        return result;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        System.out.println("The maximum sum path is: " + maxSumPath(X, Y));
    }
}
