/*Name : Pawan
 * date : 11-10-22
 * Test Whether the person is eligible or not for vote
 */
package pawan;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);// User Input
		System.out.println("Enter the age : ");
		int person= sc.nextInt();
		
		if(person >=18)// Checking The person is eligible or not
		{
			System.out.println("IT Is Eligible ");
		}
		else
		{
			System.out.println("Not eligible ");
		}
		
	}


}
