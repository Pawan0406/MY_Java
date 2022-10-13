/*Program : Program to demonstrate on nested if. Take the input from user.
* Name :Pawan
* Date : 13/10/22
 */

package pawan;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);			// taking input  
		System.out.println("Enter Number :");  
		int num = sc.nextInt();
		
		if(num >= 90)
		{
			System.out.println("grade is  A");
		}
		
		else if (num >=84 && num<=90)
		{
			System.out.println("grade is A1");
		}
		else if (num >=74 && num<=84)
		{
			System.out.println("grade is B");
		}
		else if (num>=64 && num <= 74)
		{
			System.out.println("grade is C");
		}
		else if (num<=64 && num >=34)
		{
			System.out.println("grade is  C");
		}
		else
		{
			System.out.println(" Oops fail");
		}
	}

}
