 import java.util.*;
 
public class BirthdayWizard {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter birth year: ");
		int birthYear = keyboard.nextInt();
		System.out.println("Enter an age you would like to know about:");
		int targetAge = keyboard.nextInt();
		
		birthYear += targetAge;
		
		System.out.println("You turn " + targetAge + " in the year " + birthYear);
	}

}
