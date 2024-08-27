public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = { { 5 } };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            ans += mat[i][i] + mat[i][n - 1 - i];
            System.out.println("primaray : " + mat[i][i] + " Secondary : " + mat[i][n - 1
                    - i] + " ans : " + ans);
            // System.out.println(mat);
        }
        if (mat.length % 2 == 1) {
            ans -= mat[n / 2][n / 2];
        }
        return ans;
    }
}
