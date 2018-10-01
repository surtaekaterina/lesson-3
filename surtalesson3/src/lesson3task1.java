
public class lesson3task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 4, 5, };
		double[] arr2 = new double[] { 1.1, 2.2, 3.3 };
		// int sum = 0;
		int sum = sumArray(arr);
		printSum(sum);
		double sum2 = sumArray2(arr2);
		printSum(sum2);

	}

	static int sumArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		return sum;

	}

	static double sumArray2(double arr2[]) {
		double sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum2 = sum2 + arr2[i];

		}
		return sum2;

	}

	static void printSum(int x) {
		System.out.print("SumArray1" + x);
	}

	static void printSum(double x) {
		System.out.print("SumArray2" + x);
	}
}
