/*************************************
 * File    : Student.java
 * Author  : Justin Jolly
 * Version : 1.0
 * Date    : 13-12-2021
 **************************************/
class studentDetails{
	int rollNumber;
	String Name;
}
public class Student {
	public static void main(String[] args) {
		studentDetails s1 = new studentDetails();
		s1.rollNumber = 1;
		s1.Name = "Justin";
		System.out.println(s1.rollNumber+" "+s1.Name);
		studentDetails s2 = new studentDetails();
		s2.rollNumber = 2;
		s2.Name = "Ramesh";
		System.out.println(s2.rollNumber+" "+s2.Name);
	}
}
