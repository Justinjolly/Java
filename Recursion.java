/*******************************************
 * File    : Recursion.java
 * Program : To find factorial of a number using recursion
 * Author  : Justin Jolly
 * Version : 1.0
 * Date    : 12-12-2021
 *******************************************/ 
public class Recursion {
	static int factorial(int i) {
		if (i==1) {
			return 1;
		}
		else {
			return (i*factorial(i-1));
		}
	}
	public static void main(String[] args) {
		System.out.println("Factorial is: "+ factorial(5));
	}
}
