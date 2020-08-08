import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // y axis
        int m = s.nextInt(); // x axis

        String[][] theArray = new String[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                theArray[i][j] = "*";
            }

        }


        //Output Original Array

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(theArray[i][j]);
            }

            System.out.println();

        }

        // Create Rotated Array

        String[][] theRotatedArray = new String[m][n];

        // Output Rotated Array

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(theRotatedArray[i][j]);
            }

            System.out.println();

        }







    }
}