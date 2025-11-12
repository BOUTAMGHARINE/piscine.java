public class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        int [][] a = new int[n][n];
        int left=0   , right=n-1  ,top=0   ,button = n-1;
        int c = 1;


        while (right >= left) {

            for (int i = left ; i <= right ;i++) {
                a[top][i] = c++;
            }
            top++;
             for (int i = top ; i <= button ;i++) {
                a[i][right] = c++;
            }
            right--;
             for (int i = right ; i >= left ;i--) {
                a[button][i] = c++;
            }
            button--;
             for (int i = button ; i >= top ;i--) {
                a[i][left] = c++;
            }
            left++;


        }
        return a;

    }
}
/* public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n]; // Crée une matrice n x n
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int num = 1; // Le nombre à placer dans la matrice

        while (left <= right && top <= bottom) {
            // 1️⃣ Parcours vers la droite
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // 2️⃣ Parcours vers le bas
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // 3️⃣ Parcours vers la gauche
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // 4️⃣ Parcours vers le haut
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    } */