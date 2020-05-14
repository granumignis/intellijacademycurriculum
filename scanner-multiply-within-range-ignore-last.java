import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int begNumber = s.nextInt();
		int endNumber = s.nextInt();
		long productTotal = (long) begNumber;

		int nextNumber = 0;

		for (int i = begNumber; i < endNumber; i++) {

			nextNumber = i + 1;

			if (nextNumber != endNumber) {
				productTotal = productTotal * nextNumber;
			}

		}

		System.out.println(productTotal);
		s.close();
	}
}
