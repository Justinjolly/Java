/*******************************************
 * File    : Operators.java
 * Program : To perform Arithmetic operations
 * Author  : Justin Jolly
 * Version : 1.0
 *******************************************/ 
import java.util.Scanner; 
public class operators {
	public static void main(String[]args) {
		int number1;
		int number2;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		number1 = SC.nextInt();
		System.out.println("Enter the number2: ");
		number2 = SC.nextInt();
		int sum =number1 + number2;
		System.out.println("sum: "+sum);
		int subtraction = number1 - number2;
		System.out.println("subtraction: "+subtraction);
		int multiplication = number1 * number2;
		System.out.println("Multiplication: "+multiplication);
		float division = (float)number1 / number2;
		System.out.println("Division: "+division);
		SC.close();
	}

}
