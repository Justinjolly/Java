/*******************************************
 * File    : Overriding.java
 * Program : To perform overriding
 * Author  : Justin Jolly
 * Version : 1.0
 *******************************************/
class Myclass{
	int x=8;
}
public class Overriding {
	public static void main(String[] args) {
    Myclass r=new Myclass();
    System.out.println("Before Overriding: ");
    System.out.println(r.x);
    r.x=25;
    System.out.println("After Overriding: ");
    System.out.println(r.x);
	}

}
