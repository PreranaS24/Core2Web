//Program to print the below pattern
//
/* 10
 * 10 9
 * 9 8 7
 * 7 6 5 4
 */

class Program3_10to4_Pattern{

	public static void main(String[] args){

	int x = 10;

	for(int i = 1 ; i <= 4; i++ ){

		for(int j = 1; j <= i ; j++ ){

			System.out.print(x + " ");
			x--;

		}
		x++;
		System.out.println();
	}

    }
  }
