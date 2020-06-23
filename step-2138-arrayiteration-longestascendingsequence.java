import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ArraySize = s.nextInt();
        int[] array = new int[ArraySize];
        int ascendingSequenceCounter = 0;
        int lastAscendingSequenceCount = 0;

        for (int i = 0; i < ArraySize; i++) {
            //System.out.print("**For Loop Begin**\n");
            array[i] = s.nextInt();

            if (i == 0) {
                ascendingSequenceCounter++;
            }

            if (i > 0 && (array[i] > array[i-1])) {
                //System.out.print("The current array value of " + String.valueOf(array[i]));
                //System.out.print(" is bigger than the previous array value of " + String.valueOf(array[i-1] + "\n\n"));
                ascendingSequenceCounter++;

            } else if (i > 0) {

                if (ascendingSequenceCounter > lastAscendingSequenceCount) {
                    lastAscendingSequenceCount = Integer.valueOf(ascendingSequenceCounter);
                }
                ascendingSequenceCounter = 1;


            }

            //System.out.println("i: " + String.valueOf(i));
            //System.out.println("array[i]:" + String.valueOf(array[i]));
            //if (i != 0) {
                //System.out.println("array[i-1]:" + String.valueOf(array[i - 1]));
            //}
            //System.out.println("ascendingSequenceCounter: " + ascendingSequenceCounter);
            //System.out.println("lastAscendingSequenceCount: " + lastAscendingSequenceCount);



        //System.out.print("**For Loop End**\n\n");
        }

        System.out.println(lastAscendingSequenceCount);



    }
}