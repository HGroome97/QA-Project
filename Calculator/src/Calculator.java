import java.util.function.BiFunction;

public class Calculator {

	public static void main(String[] args) {
		/*System.out.println(addNumbers(10, 20));
		System.out.println(multNumbers(10, 20));
		System.out.println(subNumbers(10, 20));
		System.out.println(divNumbers(10, 20));*/

/*		System.out.println(unknownOp(10, 20, "+"));
		System.out.println(unknownOp(10, 20, "-"));
		System.out.println(unknownOp(10, 20, "*"));
		System.out.println(unknownOp(10, 20, "/"));
		System.out.println(unknownOp(10, 20, "Test"));*/
		
		/*System.out.println(unknownOpLambda(10, 20, "+"));
		System.out.println(unknownOpLambda(10, 20, "-"));
		System.out.println(unknownOpLambda(10, 20, "*"));
		System.out.println(unknownOpLambda(10, 20, "/"));
		System.out.println(unknownOpLambda(10, 20, "Test"));*/
		
		MathsOperation addition = (a,b) -> a+b;
		MathsOperation subtraction = (a,b) -> a-b;
		MathsOperation multiplication = (a,b) -> a*b;
		MathsOperation division = (a,b) -> a/b;
		
		calculate(addition, 5,7);
		calculate(subtraction, 5,7);
		calculate(multiplication, 5,7);
		calculate(division, 1,2);
		
	}
	
	private static void calculate(MathsOperation func, int a, int b) {
		System.out.println(func.operate(a,b));
	}




	public static double addNumbers(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
	}

	public static double multNumbers(int num1, int num2) {
		int num3 = num1 * num2;
		return num3;
	}

	public static double subNumbers(int num1, int num2) {
		int num3 = num1 - num2;
		return num3;
	}

	public static double divNumbers(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("Can't divide by 0");
			return 0;
		} else {
			int num3 = num1 / num2;
			return num3;
		}
	}

	public static double unknownOp(int num1, int num2, String operation) {
		switch (operation) {
		case "+":
			return (addNumbers(num1, num2));
		case "-":
			return (subNumbers(num1, num2));
		case "*":
			return (multNumbers(num1, num2));
		case "/":
			return (divNumbers(num1, num2));
		default:
			System.out.println("Invalid Syntax");
			return 0;
		}

	}
	

	public static Integer unknownOpLambda(int num1, int num2, String operation) {
		BiFunction<Integer, Integer, Integer> f;
		switch (operation) {
		case "+":
			 f = (a,b) -> a+b;
			 return f.apply(num1,num2);
		case "-":
			 f = (a,b) -> a-b;
			 return f.apply(num1,num2);
		case "*":
			 f = (a,b) -> a*b;
			 return f.apply(num1,num2);
		case "/":
			 f = (a,b) -> a/b; 
			 return f.apply(num1,num2);
		default:
			System.out.println("Invalid Syntax");
			return 0;
		}

	 }

}
			


