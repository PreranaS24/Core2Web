/* 
 *
 * 		WAP to print the following pattern
 *		
 *		Row = 8;
 *
 * 		$
 * 		@	@	
 * 		&	&	&	
 * 		#	#	#	#
 * 		$	$	$	$	$
 * 		@	@	@	@	@	@
 * 		&	&	&	&	&	&
 * 		#	#	#	#	#	#	#
 *
 *
 * 	Use this loop strictly for the outer loop
 * 	int row;
 * 	Take the number of rows from user
 * 	for(int i = 1; i<=row ; i++){
 *
 * 	}
 */

import java.io.*;

class Q8_Dollar_Hash_Pattern{

		public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Row size.");

		int row = Integer.parseInt(br.readLine());

		for(int i = 1; i<=row ; i++){

		for(int j = 1; j<=i; j++){

				if(i%4 == 0)
					System.out.print("# ");
				else if(i%4 == 1)
					System.out.print("$ ");
				else if(i%4 == 2)
					System.out.print("@ ");
				else if(i%4 == 3)
					System.out.print("& ");

		    }
			System.out.println();
		   }
		}	
	   }










