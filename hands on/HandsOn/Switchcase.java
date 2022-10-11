/*program to demonstrate (switch)and printing week days
 * Name : pawan
 * date : 11-10-22
 */

package pawan;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Taking user Input
		System.out.println("Enter the days  : ");
		int weeks = sc.nextInt();
		
		switch (weeks)//Switch Case
		{
		case 1:
			System.out.println("This is Monday");
			break;
		case 2:
			System.out.println("This is Tuesday");
			break;
		case 3:
			System.out.println("This is Wednesday");
			break;
		case 4:
			System.out.println("This is Thusday");
			break;
		case 5:
			System.out.println("This is Friday");
			break;
		case 6:
			System.out.println("This is Saturday");
			break;
		case 7:
			System.out.println("This is Sunday");
			break;
			default://When the user put default value
			{
				System.out.println("Error");
			}
		}
	}

}


