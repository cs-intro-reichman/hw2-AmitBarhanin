// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int times = Integer.parseInt(args[0]);
		double num = 1;
		double divide = 3;
		boolean add = false;
		for (int i = 1; i < times; i++) {
			if (add) {
				num = num + (1 / divide);
			} else {
				num = num - (1 / divide);
			}
			divide = divide + 2;
			add = !add;
		}
		double approximated = num *4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approximated);
	}
}
