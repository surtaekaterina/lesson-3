
public class arraywithmetod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 4, 5, };
		printArray(arr);
		// arr = incrByOne(arr);
		//int[] arr2 = incrByOne(arr);
		int[] arr2 = incrByTwo(arr);
		printArray(arr2);

	}

	static int[] incrByOne(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 1;
		}
		return arr;

	}

	static int[] incrByTwo(int[] arr) {
		
		int arr2[] = new int[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i] + 2;
			//arr[i] += 1;
		}
		return arr2;

	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
