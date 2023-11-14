/* 	
 *
 *  	WAP 
 *
 *  	Take choice from User
 *  	Show this to User.
 *
 *  	What's your Interest?
 *  	1.Movies
 *  	2.Series
 *  	Enter your choice 1 or 2 :
 *
 *  	If user enters 1:
 *
 *  	Movie you wish to watch today
 *  	1.Founder
 *  	2.Snowden
 *  	3.Jobs
 *  	4.Her
 *  	5.Social Network
 *  	6.Wall-E
 *  	7.AI
 *
 *  	Enter your choice:
 *	2 : Snowden
 *
 *	If user enters 2:
 *
 *	Best Seriesto watch
 *	1.Silicon Valley
 *	2.Devs
 *	3.The IT Crowd
 *	4.Mr Robot
 *
 *	Print User's Choice
 *
 */

import java.util.*;

class Q4_UserChoice_Movies_Series{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("What's your Interest?"
 	+  	"\n 1.Movies"
 	+  	"\n 2.Series"
	+  	"\n Enter your choice 1 or 2 :");


		int choice;

		choice = sc.nextInt();

		switch(choice){

			case 1:
		
				System.out.println();
				System.out.println("You choose to watch -  Movies.");
				System.out.println();
				System.out.println("Movie you wish to watch today"
 				+ "\n 	1.Founder"
 				+ "\n  	2.Snowden"
 				+ "\n  	3.Jobs"
 				+ "\n  	4.Her"
 				+ "\n  	5.Social Network"
 				+ "\n  	6.Wall-E"
 				+ "\n  	7.AI"
 				+ "\n            "
 				+ "\n 	Enter your choice:");

				System.out.println();
				
				int Mov_ch;

				Mov_ch = sc.nextInt();

				System.out.println();
				
				switch(Mov_ch){

					case 1: 
						System.out.println("You choose to watch -  Founder Movie.");
						break;

					case 2: 
						System.out.println("You choose to watch -  Snowden Movie.");
						break;

					case 3: 
						System.out.println("You choose to watch -  Jobs Movie.");
						break;

					case 4:
						System.out.println("You choose to watch -  Her Movie.");
						break;

					case 5: 
						System.out.println("You choose to watch -  Social Network Movie.");
						break;

					case 6: 
						System.out.println("You choose to watch -  Wall-E Movie.");
						break;

					case 7: 
						System.out.println("You choose to watch -   AI Movie.");
						break;


					default: 
						System.out.println("You choose a wrong option.");
						break;
					}
				break;
				
			case 2:

		
				System.out.println();
				System.out.println("You choose to watch -  Series.");
				System.out.println();
				System.out.println("Best Series to watch"
 				+ "\n 	1.Silicon Valley"
 				+ "\n  	2.Devs"
 				+ "\n  	3.the IT Crowd"
 				+ "\n  	4.Mr Robot"
				+ "\n 			"
				+ "\n 	Enter your choice: ");

				System.out.println();
				
				int ser_ch;

				ser_ch = sc.nextInt();

				System.out.println();
				
				switch(ser_ch){

					case 1: 
						System.out.println("You choose to watch -  Silicon Valley Series.");
						break;

					case 2: 
						System.out.println("You choose to watch - Devs Series.");
						break;

					case 3: 
						System.out.println("You choose to watch -  the IT Crowd Series.");
						break;

					case 4: 
						System.out.println("You choose to watch -  Mr. Robot Series.");
						break;

					default: 
						System.out.println("You choose a wrong option.");
						break;
					}
				break;
	}
	}
	}
