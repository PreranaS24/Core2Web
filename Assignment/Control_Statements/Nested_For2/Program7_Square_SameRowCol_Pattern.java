//Program to print the below pattern
/* 1 2 9
 * 4 25 6
 * 49 8 81
 */

class Program7_Square_RowCol_Pattern{

	public static void main(String[] args){

		int k = 1;

		for(int i = 1 ; i <= 3 ; i++){

		for(int j = 1 ; j <= 3 ; j++){

			if((i == j) || ((i == 1) && (j == 3)) || ((i == 3) && (j == 1)))
			System.out.print(k*k  + " ");
			else
			System.out.print(k + " ");

			k++;		
		}
		System.out.println();
	
 	} 
     }	
   }  
