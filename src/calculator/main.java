package calculator;
import java.util.Scanner;
import java.lang.Math;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a first number: ");
		Double firstNumber = scan.nextDouble();
	
		System.out.println("Enter an operator : ");
		char operator = scan.next().charAt(0);
		Double secondNumber = 0.0;
		if(operator != '√') {
		System.out.println("Enter a second number: ");
		secondNumber = scan.nextDouble();
		
		}
		Double result;
		
		switch(operator) {
		case '+':
			result = firstNumber + secondNumber;
			System.out.println(firstNumber +  " + " + secondNumber + " = " + result);
			break;
		
		case '-':
			result = firstNumber - secondNumber;
			System.out.println(firstNumber +  " - " + secondNumber + " = " + result);
			break;
			
		case '/':
			result = firstNumber / secondNumber;
			System.out.println(firstNumber +  " / " + secondNumber + " = " + result);
			break;
		
		case '*':
			result = firstNumber * secondNumber;
			System.out.println(firstNumber +  " * " + secondNumber + " = " + result);
			break;
		case '^':
			result = Math.pow(firstNumber, secondNumber);
			System.out.println("The power of " + firstNumber + " to " + secondNumber + " = " + result);
			break;
		case '√':
			result = Math.sqrt(firstNumber);
			System.out.println("The square root of " + firstNumber + " = "  + result);
			break;
		}
	}
	
}

