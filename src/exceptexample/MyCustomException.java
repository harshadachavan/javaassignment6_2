package exceptexample;

import java.util.Scanner;

public class MyCustomException {
	//here I have called my Exception class defined by me to check the exception
	 static void validate(int age)throws NegativeAgeException{  
	     if(age<0)  
	      throw new NegativeAgeException("Age cannot be negative Number");  
	     else  
	      System.out.println("Your age is :"+age);  
	   }  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your age");
		Scanner sc = new Scanner(System.in);
		int myage = sc.nextInt();
		//The try block contains a block of program statements within which an exception might occur.
		try{  
		      validate(myage);  
		      }
		/*
		 * A catch block must be associated with a try block. 
		 * The corresponding catch block executes if an exception of a particular type occurs within the try block. 
		 * */
		catch(Exception m){System.out.println("Exception occured: "+m);}  
		  
		      System.out.println("Custom exception thrown");  
		      sc.close();
	}

}
