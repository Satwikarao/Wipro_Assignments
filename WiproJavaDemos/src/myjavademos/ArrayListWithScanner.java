package myjavademos;

import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	int rollno;
	String stuname;
	public Student(int rollno, String stuname) {
		super();
		this.rollno = rollno;
		this.stuname = stuname;
	}
	public int getRollno() {
		return rollno;
	}
	public String getStuname() {
		return stuname;
	}
	@Override
	public String toString() 
	{
        return "Student Details: " + getRollno() + " " + getStuname();
	}

}
public class ArrayListWithScanner {

	public static void main(String[] args) {
		int roll;
		String name1;
	    Scanner scan = new Scanner(System.in);
		ArrayList<Student> listobj = new ArrayList<Student>();

        while(true) 
        {   
	        System.out.println("1 - Add Student to ArrayList");
	        System.out.println("2 - Display Student from ArrayList");

	        //Read
	       	String input = scan.nextLine();
	       	if (input.equals("1")) 
	       	{
       		System.out.print("Enter Rollno: ");
   			roll = Integer.parseInt(scan.nextLine());
   			System.out.print("Enter Name: ");
   			name1 = scan.nextLine();
            listobj.add(new Student(roll, name1));//*************adding the record to arraylist object   
	       	}
	       	else if (input.equals("2")) 
	       	{
	       		for (Student s:listobj)
	       		{
	       			System.out.println(s);
	       		}
	       	return;	  //completed          
	       	}    

        }
	}

}

