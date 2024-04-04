public class Que1 {
    public static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int last = m - 1;
        
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[last] = X[i];
                last--;
            }
        }
        
        int i = last + 1;
        int j = 0;
        int k = 0;
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k] = X[i];
                i++;
            } else {
                X[k] = Y[j];
                j++;
            }
            k++;
        }
        
        while (j < n) {
            X[k] = Y[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        merge(X, Y);
        
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}
