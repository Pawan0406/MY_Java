/* Name :- Pawan_Doifode
 * Date :- 11-10-22
 * Print any Multiplication table for loop take the input from the user in all the program 
 */
package pawan;

import java.util.Scanner;

public class Table_Mul {

	public static void main(String[] args) {	//Main method
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);	//User Import
			System.out.println("Enter the number : ");	
			int a = sc.nextInt();
			
			for(int i=1;i<=10;i++)		//For Loop
			{
				System.out.println(i*a);
			}
			
		}

	}
