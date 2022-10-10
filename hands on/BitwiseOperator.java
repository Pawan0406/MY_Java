package operators;

import java.util.Scanner;

public class BitwiseOperator {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter first  number:");
			int num1=sc.nextInt();
			System.out.println("Enter second number:");
			int num2= sc.nextInt();
			sc.close();			// Bitwise AND operator
			System.out.println("num1&num2="+(num1 & num2));
			//    8 4 2 1
			//   ---------
			//    1 0 0 0
			//    0 1 1 1
			//   ---------
			//    0 0 0 0 = 0  
			
		    //Bitwise OR operator
			System.out.println("num1|num2="+(num1 | num2));
			//   8 4 2 1
			//   ---------
			//   1 0 0 0
			//   0 1 1 1
			//   ---------
			//   1 1 1 1 =15
			
			//Bitwise XOR operator
			System.out.println("num1^num2="+(num1 ^ num2));
            //   8 4 2 1
			//   ---------
			//   1 0 0 0
			//   0 1 1 1
			//   ---------
			//   1 1 1 1 =15
	}
	}

