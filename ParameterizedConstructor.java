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
	Students(int rollNumber,String name){
		this.rollNumber=rollNumber;
		this.name=name;
	}
}
public class ParameterizedConstructor {
	public static void main(String[] args) {
		Students r = new Students(1," Justin"); 
		System.out.println(" "+r.rollNumber + r.name);
	}

}
