/*

Given an odd number n, not exceeding 15.

Create a two-dimensional array (matrix) from n×n elements, by filling it with "." symbols
(each element of the matrix is a string containing a single symbol).


Then fill:

    The middle row of the matrix
        Divide the length of the current array by 2
            Remove the remainder from the result (maybe just store as an int to drop it)
            [ length of the current array ] - [ result of division and dropping ] = the middle row

    The middle column


    The main diagonal

        middle + 1,1 until n,0 is reached
        middle - 1,1 until 0,0 is reached


    The secondary diagonal


with the "*" symbols.






As a result, all "*"s in the array must form the star figure.
Output this matrix; elements of the array should be space separated.

*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int n = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an odd number that is not greater than 15.");

        n = scanner.nextInt();

        while (n % 2 != 0 && n > 15)
        {
            System.out.println("Enter an odd number that is not greater than 15.");
            n = scanner.nextInt();
        }



        String[][] array = new String[n][n]; // create a two-dimensional array of 'n' by 'n'
        int middle = (n - (n/2)) - 1;
        System.out.println("Middle: " + middle);



        // Define and Fill NxN array
        for (int i = 0; i < n; i++) { // this is defining the 'x axis' of the array
            System.out.println("Beginning of the i for loop, i = " + i + ", j = N/A");

            for (int j = 0; j < n; j++) { // this is defining the 'y axis' of the array
                System.out.println("Beginning of the j for loop, j = " + j + ", i = " + i);


                if (i == middle)
                {
                    //array[i][j] = "0,0";
                    array[i][j] = i + "," + j; // This is filling each 'row' of the NxN array with values
                } else if (j == middle)
                {
                    //array[i][j] = "*,*";
                    array[i][j] = i + "," + j; // This is filling each 'row' of the NxN array with values
                } else
                {
                    if (i == j)
                    {
                        array[i][j] = i + "," + j; // This is filling each 'row' of the NxN array with values
                        //array[i][j] = "|,|"; // This is filling each 'row' of the NxN array with values
                        System.out.println("diagonal:" + i + " " + j);
                    } else if (i == middle + j && j == middle - j)
                    {
                        array[i][j] = i + "," + j; // This is filling each 'row' of the NxN array with values
                        //array[i][j] = "+,+"; // This is filling each 'row' of the NxN array with values
                        System.out.println("diagonal2:" + i + " " + j);
                    } else
                    {
                        array[i][j] = i + "," + j; // This is filling each 'row' of the NxN array with values
                        //System.out.println("normal:" + i + " " + j);
                    }
                }


/*
                if (i == middle + i && j == middle + j)
                {
                    array[i][j] = "|";
                } else if (i == middle - i && j == middle - j)
                {
                    array[i][j] = "%";
                } else
                {
                    array[i][j] = "."; // This is filling each 'row' of the NxN array with values
                }
*/

            }
        }

        // Output the array contents

        for (int i = 0; i < n; i++) { // loop with variable 'i' until 'i' is one less than 'n'

            for (int j = 0; j < n; j++) { // loop with variable 'j' until 'j' is one less than 'n'
                System.out.print(array[i][j] + " "); // print out the value of the current 'Vector2' we are in during this 'dual loop'
            }

            System.out.println(); // print a line break after printing out all values for the current array ('i')

        }



    }
}
