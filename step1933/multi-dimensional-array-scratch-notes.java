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