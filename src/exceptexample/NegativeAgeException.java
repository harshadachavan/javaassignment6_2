package exceptexample;
/*
 * User defined exception needs to inherit 
 * (extends) Exception class in order to act as an exception.
 * throw keyword is used to throw such exceptions.
 * */
public class NegativeAgeException extends Exception {
	
	NegativeAgeException(String s){  
		  super(s);  
		 }  

}
