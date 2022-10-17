package matic;

import java.util.Scanner;

public class two_D {

	public static void main(String[] args) {
		
		int x, y, i, j;
		Scanner sc = new Scanner(System.in);
		
		//Taking input for first matrix row
		System.out.print("enter the 1st matrix : ");
		x = sc.nextInt();
		
		//Taking input for first matrix column
		System.out.print("Enter 1st matrix column : ");
		y = sc.nextInt();
		
		int array1[][]=new int[x][y];
		
		System.out.println();
		//Taking input for first matrix from user
		System.out.println("Enter the number of 1st matrix : ");
		
		//using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				array1[i][j]=sc.nextInt();
			}
		}
		
		//Printing element of first matrix
		System.out.println("Element of 1st matrix is : ");
		
		//Using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				System.out.print(array1[i][j]+" ");
			} System.out.println();
			
			//System.out.println();
		}
	
		int array2[][]=new int[x][y];
		//Taking input for second matrix from user
		
		System.out.println();
		System.out.println("2nd matrix : ");
		
		//using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				array2[i][j]=sc.nextInt();
			}
		}
		
		//Printing element of second matrix
		System.out.println("2nd elemwent ");
		
		//using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				System.out.print(array2[i][j]+" ");
			} System.out.println();
			
			//System.out.println();
		}
		//System.out.println();
		
		
		int array3[][]=new int[x][y];
		
			//Addition of two numbers
			System.out.println();
			System.out.println("Addition is : ");
			
			//Using for loop
			for(i=0;i<x;i++)	
			{
				
				for(j=0;j<y;j++)	
				{
					array3[i][j]=array1[i][j]+array2[i][j];  
					System.out.print(array3[i][j]+" "); 
				}
				 System.out.println();
			}	


	}

}
