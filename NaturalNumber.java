/* Program to print  sum of 10 Natural Numbers using while loop.
* Name : pawan
* Date : 13/10/22
 */


package pawan;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);        

		System.out.println("ENTER  A NUMBER :  ");
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
