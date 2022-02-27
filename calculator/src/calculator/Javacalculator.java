package calculator;

import java.util.Scanner;

public class Javacalculator {
	public static void main(String[] args) {
		double num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter first number:");
		/*we are using data type double so that user
		 * can enter integer as well asfloating point
		 * value
		 */
		num1 = scanner.nextDouble();
		System.out.print("enter second number:");
		num2 = scanner.nextDouble();
		
		System.out.print("enter an operator(+,-, *, /):");
		char operator = scanner.next().charAt(0);
		
		scanner.close();
		double output;
		
		switch(operator) {
		case '+':
			output = num1 + num2;
			break;
		case '-':
			output = num1 - num2;
			break;
		case '*':
			output = num1 * num2;
			break;
		case '/':
			output = num1/num2;
			break;
			
		/* If user enters any other operator or char apart from
		 * +,-,*,/, then display an error message to user
		 */
		default:
			System.out.printf("You ave entered wrong operator");
			return;
		}
		System.out.println(num1+""+operator+""+num2+":"+output);
	}

}
