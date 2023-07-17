//Program to print the below pattern
/* 14 15 16 17
 * 15 16 17 18
 * 16 17 18 19
 * 17 18 19 20
 */

class Program3_14151617181920_Pattern{

	public static void main(String[] args){

		int k = 13;

		for(int i = 1 ; i <= 4 ; i++){

		for(int j = 1 ; j <= 4; j++){

			int sum = k + j;
			System.out.print(sum + " ");
			
		}
		System.out.println();
		k++;
 	} 
     }	
   }  
