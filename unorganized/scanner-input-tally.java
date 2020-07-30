import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        int numPerfect = 0;
        int numReject = 0;
        int numToFix = 0;

        Scanner s = new Scanner(System.in);
        int numParts = s.nextInt();

        for (int i = 0; i < numParts; i++) {

            int tempInput = s.nextInt();

            if (tempInput == 0) {
                numPerfect++;
            } else if (tempInput == -1) {
                numReject++;
            } else if (tempInput == 1) {
                numToFix++;
            }

        }

        s.close();
        System.out.println(numPerfect + " " + numToFix + " " + numReject);

    }
}