public class Test0001StarPattern {

    public static void main(String[] args) {

        int n = 5;
        int total = 2 * n - 1;

        for (int i = 1; i <= total; i++) {

            int row;

            // find current row position
            if (i <= n) {
                row = i;
            } else {
                row = total - i + 1;
            }

            // print spaces before star
            for (int j = 1; j <= n - row; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // space between two stars
            if (row > 1) {
                int space = 2 * row - 3;

                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}