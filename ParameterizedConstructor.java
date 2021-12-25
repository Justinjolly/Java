/*******************************************
 * File    : ParameterizedConstructor.java
 * Program : To demonstrate Parameterized Constructor in Java
 * Author  : Justin Jolly
 * Version : 1.0
 * Date    : 09-12-2021
 *******************************************/
class Students{
	int rollNumber;
	String name;
	Students(int rollNumber,String name){//parameterized Constructor
		this.rollNumber=rollNumber;
		this.name=name;
	}
}
public class ParameterizedConstructor {
	public static void main(String[] args) {
		Students r1 = new Students(1," Justin");
		Students r2 = new Students(2," Suresh");
		System.out.println(" "+r1.rollNumber + r1.name);
		System.out.println(" "+r2.rollNumber + r2.name);
	}

}
