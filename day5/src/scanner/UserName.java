package scanner;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the user name:");
		String n=input.nextLine();
		
		System.out.println("User Name:"+n);
	}

}
