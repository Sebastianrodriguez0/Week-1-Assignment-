import java.util.Scanner;

public class TimeComp {
	public static void main(String[] args){
	 	int hrs, mins, secs, totalSeconds;
	 	Scanner scan = new Scanner (System.in);
		System.out.print("Enter number of seconds: ");
		secs = scan.nextInt();
		hrs = secs / 3600;
		mins = (secs % 3600) / 60;
		secs = secs % 60;
		
		System.out.print("The time in hours, minutes, and seconds is: " 
						 + hrs + " hours, " + mins + " minutes, and " 
						 + secs + " seconds.");	 	
	}

}
