package matic;

import java.util.Scanner;

public class two_D {

	public static void main(String[] args) {
		
		int row, col,i,j;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		row = in.nextInt();

		System.out.println("Enter the number columns");
		col = in.nextInt();

		int array1[][] = new int[row][col];
		int array2[][] = new int[row][col];
		int sum[][] = new int[row][col];

		System.out.println("Enter the elements of matrix1");
		i=0;
		do
		{ 
		j=0;
		do
		{
			array1[i][j] = in.nextInt();
		j++;
		}while(j < col);
		i++;

		} while ( i < row);
		System.out.println("Enter the elements of matrix2");


		i=0;
		do
		{ 
		j=0;
		do
		{
			array2[i][j] = in.nextInt();
		j++;
		}while(j < col);
		i++;

		} while ( i < row);

		i=0;
		do
		{ 
		j=0;
		do
		{

			sum[i][j] = array1[i][j] + array2[i][j] ; 
		j++;
		}while(j < col);
		i++;

		}while ( i < row);


		System.out.println("Sum of matrices:-");
		i=0;
		do
		{ 
		j=0;
		do
		{

		System.out.print(sum[i][j]+" ");
		j++;
		}while(j < col);
		System.out.println();
		i++;

		}while(i< row);

		}
		}
