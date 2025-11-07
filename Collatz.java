// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seeds = Integer.parseInt(args[0]);
		String mode = args[1];
		int count = 0;
		int num = 0;
		for (int i = 1; i <= seeds; i++) {
			count = 1;
			num = i;
			while (num != 1 || count == 1) {
				if (mode.equals("v"))
					System.out.print(num + " ");
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = num * 3 + 1;
				}
				count++;
			}
			if (mode.equals("v")) {
				System.out.print(num + " (" + count + ")");
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Every one of the first " + seeds + " hailstone sequences reached 1.");

	}
}
