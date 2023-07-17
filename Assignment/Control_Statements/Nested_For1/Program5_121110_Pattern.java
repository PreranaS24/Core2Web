//Program to print the below pattern.
//
/* 12 12 12
 * 11 11 11
 * 10 10 10 
 */

class Program5_121110_Pattern{

	public static void main(String[] args){

		
	int k = 12;

	for(int i = 1; i <= 3; i++){

		for(int j = 1; j <= 3; j++){

			System.out.print(k + " ");
		}

		System.out.println();
		k--;
	}
    }
  }
