/* 
 *
 *
 * 		WAP and take two characters if these characters are equal then print them as it is
 * 		but if they are unequal then print their difference.
 * 		{Note: Consider Positive DifferenceNot ASCIIs}
 * 		
 * 		Input : a p
 * 		Output : The difference between a and p is 15
 *
 */

import java.io.*;

class Q6_Difference_Between_Characters{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two characters");

		char ch1 = (char)br.read();

		br.skip(1);

		char ch2 = (char)br.read();

		
		if(ch1 == ch2)
			System.out.println("The two characters " + ch1 + " and " + ch2 + " are same. ");
		else{	

			int diff = ch1 - ch2;

			if(diff < 0 ){
					diff = diff*(-1);
				     }
			System.out.println("Differnce between two characters " + ch1 + " and " + ch2 + " is " +  diff );
		}

	   }

	}
