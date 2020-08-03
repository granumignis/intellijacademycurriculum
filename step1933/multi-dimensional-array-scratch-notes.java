int[][][] cubic = new int[3][4][5]; // an three-dimensional array (cube)    
 
int current = 1; // it stores a value to fill elements
 
for (int i = 0; i < 3; i++) { // iterating through each 2D array ("table" or "matrix")
    for (int j = 0; j < 4; j++) { // iterating through each 1D array ("vector") array of a "matrix"
        for (int k = 0; k < 5; k++) { // iterating through each element of a vector
            cubic[i][j][k] = current; // assign a value to an element
        }
    }
    current++; // get the next value to the next "matrix"
}
        
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 5; k++) {
            System.out.print(cubic[i][j][k] + " ");
        }
        System.out.println();
    }
    System.out.println();
}

///////////////////////

// this code fills the 3-dimensional array
int current = 1;
for (int[][] dim2Array : cubic) {     // for each 2-dim array
    for (int[] vector : dim2Array) {  // for each 1-dim array (vector) of 2-dim array
        Arrays.fill(vector, current); // fill the vector
    }
   current++; // the next current
}
 
// this code prints all 2-dimensional arrays
for (int[][] dim2Array : cubic) {
    for (int[] vector : dim2Array) {
        System.out.println(Arrays.toString(vector));
    }
    System.out.println();
}

//

int[][] c = { 
   { 40, 30, 25, 30, 15},
   { 13, 12, 16 },
   { 101, 125, 114, 131 }
}; 
 
System.out.print(c.length + " ");
 
for (int[] nestedArray : c) {
   System.out.print(nestedArray.length + " ");
}

// ^ this prints 3534

/*

True statements about multi-dimensional arrays:

A multi-dimensional array is an "array of arrays".[ t ]
It's possible to create an array of arrays with different length. [ t ]

*/

//



// Example of code to create an 'n x n' array
// from jetbrains academy user Nikita Zhishchenko

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int digit = scan.nextInt();
        int[][] arr = new int[digit][digit];

        for (int i = 0; i < digit; i++) {

            for (int k = 0; k < digit; k++) {
                arr[i][k] = Math.abs(i - k);
                System.out.print(arr[i][k] + " ");
            }

            System.out.println("");
        }
    }
}


// Another example from 'Louis Le'
//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = Math.abs(j - i);

            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println();
        }
    }
}


/// I retyped Louis' answer and added spacing and comments to help me understand
// the result is below


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] array = new int[n][n];


        // Define and Fill NxN array
        for (int i = 0; i < n; i++) { // this is defining the 'x axis' of the array

            for (int j = 0; j < n; j++) { // this is defining the 'y axis' of the array
                array[i][j] = Math.abs(j - i); // This is filling each 'row' of the NxN array with values

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

//

