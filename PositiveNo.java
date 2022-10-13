/*Program to Print sum of only Positive numbers using do-while Loop.
 *  And take the Input from User, Enters any negative number then that number should not added to sum.
 * Name : Pawan
 * Date : 13/10/22
 */

package pawan;

import java.util.Scanner;

public class PositiveNo {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);        // Take number from user

		System.out.println("ENTER THE NUMBER :  ");
		int num = sc.nextInt();
		System.out.println("This is a Natural Number : ");
		int i = 1;
		while(i<=num)// While loop
		{
			System.out.println(i+"");
			i++;
		}
	}

}
