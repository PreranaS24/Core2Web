/* 
 *
 * 			WAP Real time example using switch case.
 *
 */

import java.util.*;

class Q5_RealTime_Hotel_Example{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println(" Welcome to Khao Piyo Restaurant");

				System.out.println("Would you like to have Veg or Non veg Food ?"
						+ "\n 1. Vegeterian"
						+ "\n 2. Non Vegeterian"
						+ "\n  		"
						+ "\n   Enter Your Choice :"
						+ "\n 				");
				
			int ch1 = sc.nextInt();

			System.out.println();
		
			switch(ch1){

				case 1:
					System.out.println("You choose to have Vegeterian Food");
					System.out.println();
					System.out.println("Would you like to have Sarters Or Directly Main Course ?"
								+ "\n 1. Starters"
								+ "\n 2. Main Course"
								+ "\n  		"
								+ "\n   Enter Your Choice :"
								+ "\n 				");
				
					int ch2 = sc.nextInt();

					System.out.println();
					
					switch(ch2){

						case 1: 
							System.out.println("You choose to have Starters");
							break;

						case 2: 
							System.out.println("You choose to have Main Course");
							break;

					}
					break;

					
				case 2:
					System.out.println("You choose to have Non Vegeterian Food");
					System.out.println();
					System.out.println("Would you like to have Sarters Or Directly Main Course ?"
								+ "\n 1. Non Veg Starters"
								+ "\n 2. Non Veg Main Course"
								+ "\n  		"
								+ "\n   Enter Your Choice :"
								+ "\n 				");
				
					int ch3 = sc.nextInt();

					System.out.println();
					
					switch(ch3){

						case 1: 
							System.out.println("You choose to have Non Veg Starters");
							break;

						case 2: 
							System.out.println("You choose to have Non Veg Main Course");
							break;

					}
					break;
			}
		}
	}

