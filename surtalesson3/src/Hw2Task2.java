
public class Hw2Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float y[] = new float[] { 327, 381, 891, 918, 212, 848, 770, 363, 416, 736 };
		float max = y[0];

		for (int i = 1; i < y.length; i++) {
			if (y[i] > max) {
				max = y[i];
			}
		}
		for (int i = 0; i < y.length; i++) {
			y[i] = y[i] / max;
		}
		for (int i = 0; i < y.length; i++) {
			System.out.printf("%.2f", y[i] + " ");
		}
	}
}
