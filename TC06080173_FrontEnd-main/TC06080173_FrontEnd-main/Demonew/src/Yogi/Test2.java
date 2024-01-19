package Yogi;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int id;
		String name;
		float marks;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id: ");
		id = sc.nextInt();
		
	 System.out.print("Enter name: ");
	 name = sc.next();
		
	 System.out.print("Enter marks: ");
	 marks = sc.nextFloat();
		
	 System.out.print("Enter any Character: ");
	 ch = sc.next().charAt(2); // Change the index to 0 to read the first character
		
	 System.out.println("Id: " + id);
	 System.out.println("Name: " + name);
	 System.out.println("Marks: " + marks); // Corrected the variable name to "marks"
	 System.out.println("Character: " + ch);
	}
}
