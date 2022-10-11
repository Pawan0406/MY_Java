
/*Demonstate if-else statement of 5 Subject The Person who gets above 60% will be pass other wise fail
 * Name :- Pawan_Doifode
 * Date :- 11-10-22
 */
package pawan;

import java.util.Scanner;

public class Percent_of_Marks {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String Name = sc.nextLine();
		System.out.println("Enter English Mark");
		int English = sc.nextInt();
		System.out.println("Enter Maths Mark");
		int Maths = sc.nextInt();
		System.out.println("Enter Science Mark");
		int Science = sc.nextInt();
		System.out.println("Enter Geog Mark");
		int Geog = sc.nextInt();
		System.out.println("Enter History Mark");
		int History = sc.nextInt();
		
		int Percentage = (English+Maths+Science+Geog+History)/5;
		System.out.println("percentage : "+Percentage);
		if( Percentage>=60)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("fail");

		}
		
	}
}
