import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int x;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		x = input.nextInt();
		
		for(int i = 1; i <= x; i*=4)
			System.out.println("Power of 4: " + i);
		
		for(int i = 1; i <= x; i*=5)
		System.out.println("Power of 5: " + i);
	}	
}		
