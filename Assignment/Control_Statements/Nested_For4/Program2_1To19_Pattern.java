//Program to print the below pattern
//
/* 1
 * 3 4
 * 6 7 8
 * 10 11 12 13
 * 15 16 17 18 19
 */

class Program2_1to19_Pattern{

	public static void main(String[] args){

	int x = 1;

	for(int i = 1 ; i <= 5; i++ ){

		for(int j = 1; j <= i ; j++ ){

			System.out.print(x + " ");
			x++;

		}
		x++;
		System.out.println();
	}

    }
  }
