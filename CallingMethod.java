/*******************************************
 * File    : CallingMethod.java
 * Program : To demonstrate calling a method in Java
 * Author  : Justin Jolly
 * Version : 1.0
 * Date    : 09-12-2021
 *******************************************/
import java.util.Scanner;
class method{
	String word;
	void print() {
		System.out.println("The word is: "+word);
	}
}
public class CallingMethod {
	public static void main(String[] args) {
		method r = new method();
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter a word: ");
		r.word = SC.next();
		r.print();
	}

}
