
public class Hw2Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a[] = new double [] {-1.49, 0.50, -4.70, -1.08, -4.95, 1.14, -2.46, 2.61, -3.14,  4.35, 0.52, 1.24, 4.29, -2.39, -3.95, -4.91, -4.35, 3.60, 2.50, -0.21 };
		double b[] = new double [10]; 
		int j = 0;
		double sum = 0;
		
		for(int i=1; i < a.length; i = i + 2) {
			if (a[i] > 0) {
				b[j] = a[i];
				j++;
			}
		}
		
		for (j=0; j < b.length; j++) {
			sum = sum + Math.pow(b[j], 2);
			System.out.println(b[j]);
		}
		System.out.print(String.format("%.2f", sum));
	}

}
