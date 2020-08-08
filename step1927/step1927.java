import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int n = 0;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        while (n % 2 != 0 && n > 15) {
            n = scanner.nextInt();
        }
        String[][] array = new String[n][n]; // create a two-dimensional array of 'n' by 'n'
        int middle = (n - (n / 2)) - 1;

        int reverseDiagonalI = middle - middle;
        int reverseDiagonalJ = middle * 2;

        // Define and Fill NxN array
        for (int i = 0; i < n; i++) { // this is defining the 'x axis' of the array
            if (i > 0) {
                reverseDiagonalI = reverseDiagonalI + 1;
                reverseDiagonalJ = reverseDiagonalJ - 1;
            }
            for (int j = 0; j < n; j++) { // this is defining the 'y axis' of the array
                if (i == middle) {
                    array[i][j] = "*"; // This is filling each 'row' of the NxN array with values
                } else if (j == middle) {
                    array[i][j] = "*"; // This is filling each 'row' of the NxN array with values
                } else {
                    if (i == j) {
                        array[i][j] = "*"; // This is filling each 'row' of the NxN array with values
                    } else if (i == reverseDiagonalI && j == reverseDiagonalJ) {
                        array[i][j] = "*"; // This is filling each 'row' of the NxN array with values
                    } else {
                        array[i][j] = "."; // This is filling each 'row' of the NxN array with values
                    }
                }
            }
        }

        // Output the array contents
        for (int i = 0; i < n; i++) { // loop with variable 'i' until 'i' is one less than 'n'

            for (int j = 0; j < n; j++) { // loop with variable 'j' until 'j' is one less than 'n'
                System.out.print(array[i][j] + " "); // print out the value of the current 'Vector2'
            }

            System.out.println(); // print a line break after printing out all values for the current array ('i')
        }
    }
}