//Program to print the below pattern
//
/* A B C D
 * B C D
 * C D
 * D
 */

class Program5_AtoD_Pattern{

	public static void main(String[] args){
	
	char ch = 'A';

	for(int i = 1 ; i <= 4; i++ ){

		char chi = ch;

		for(int j = 4; j >= i ; j-- ){
			
			System.out.print(chi + " ");
			chi++;

		}
	        ch++;
		System.out.println();
	}

    }
  }
