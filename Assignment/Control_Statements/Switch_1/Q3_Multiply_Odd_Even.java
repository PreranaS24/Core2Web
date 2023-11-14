/* 
 *
 * 		WAP in which the user should enter two numbers if both the numbers are positive
 * 		multiply them and provide to switch case to verify the number is even or odd,
 * 		if the user enters any negative number program should terminate by saying "Sorry
 * 		negative number not allowed."
 *
 */

import java.io.*;

class Q3_Multiply_Odd_Even{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two numbers : ");

		int N1 = Integer.parseInt(br.readLine());

		int N2 = Integer.parseInt(br.readLine());

		if( N1 < 0 || N2 < 0){
			System.out.println("Sorry Negative number not allowed.");
			System.exit(0);
		}

		switch((N1 * N2)%2){

			case 0:
			System.out.println("Multiplication of " + N1 + " and " + N2 + " is even.");
			break;

			case 1:
			System.out.println("Multiplication of " + N1 + " and " + N2 + " is Odd.");
			break;
			}
	         }
	}
