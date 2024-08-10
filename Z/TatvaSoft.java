package Z;

public class TatvaSoft {
    public static void main(String[] args) {
        // int i, j;
        // for (i = 1; i <= 4; i++) {
        // for (j = 1; j <= i; j++) {
        // if (j % 2 == 0) {
        // System.out.print(0);
        // } else {
        // System.out.print(1);
        // }
        // }
        // System.out.println();
        // }

        /*
         * 1
         * 1001
         * 101101
         * 10100101
         */

        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(0);

                } else {
                    System.out.print(1);
                }

            }
            System.out.println();
        }
    }
}
