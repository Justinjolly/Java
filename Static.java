/*******************************************
 * File    : Static.java
 * Author  : Justin Jolly
 * Version : 1.0
 * Date    : 12-12-2021
 *******************************************/ 
class StaticVari{
    
	void display(){
		System.out.println("It is a non Static Variable");
	}
}
public class Static {
	 static void print() {
			System.out.println("It is a static variable");
		}
	public static void main(String[] args) {
		//static
		print();
		//non static
		StaticVari s = new StaticVari(); 
		s.display();
	}
}

