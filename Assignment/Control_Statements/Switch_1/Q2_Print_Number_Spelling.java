/* 	
 *
 *  	WAP that asks the user to enter a number from 0 to 5 and print its spelling. If the 
 *  	entered number is greater than 5 print , entered number is greater than 5.
 *
 *  	eg:- Input - Enter a number - 4
 *  	     Output - four
 *
 */

import java.io.*;

class Q2_Print_Number_Spelling{

	public static void main(String[] args) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter the number : ");

	int num = Integer.parseInt(br.readLine());

	if( num > 5)
	System.out.println("Entered number is greater than 5.");
	
	if( num < 0)
	System.out.println("Entered number is a negative number.");

	switch(num){

		case 1:
			System.out.println("one");
			break;

		case 2:
			System.out.println("Two");
			break;

		case 3:
			System.out.println("Three");
			break;

		case 4:
			System.out.println("Four");
			break;

		case 5:
			System.out.println("Five");
			break;

		default:
			System.out.println("Number given is either a negative number or greater than 5.");
			break;

  	}
  	}
  	}
