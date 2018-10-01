
public class calcwithmetod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 8;
		char operation = '+';

		int result = calculate(x, y, operation);
		PrintResult(result);
	}

	static void PrintResult(int asd) {
		System.out.println(asd);
	}

	static int calculate(int x1, int y1, char o) {
		int result = 0;
		switch (o) {
		case '+':
			result = x1 + y1;
			break;
		case '-':
			result = x1 - y1;
			break;
		case '*':
			result = x1 * y1;
			break;
		case '/':
			if(ValidateDenaminator(y1)) {
				result = x1 / y1;
			}else {
				System.out.println("Can't divide");
			}
			
			break;
		}

		return result;
	}

	static boolean ValidateDenaminator(int y) {
		if(y > 0) {
			return true;
		} else
			return false;
		
	}
	
}

