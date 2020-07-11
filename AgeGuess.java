import java.util.Scanner;

public class AgeGuess 
{ 
	public static void main(String[] args) 
	{ 	  
		  int ageGuess;	
		  String name;
		  Scanner scan = new Scanner (System.in);
		  
		  System.out.print("Please enter name: ");
		  name = scan.nextLine();
		  
		  System.out.print("Please enter the age: ");
		  ageGuess = scan.nextInt();
		  
		  System.out.println("Name is " + name);
		  System.out.println("Age is " + ageGuess);
	}
}
