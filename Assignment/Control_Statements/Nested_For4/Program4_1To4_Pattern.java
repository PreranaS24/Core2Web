//Program to print the below pattern
//
/* 1 2 3 4
 * 2 3 4
 * 3 4
 * 4
 */

class Program4_1to4_Pattern{

	public static void main(String[] args){

	int x = 1;
	int y = 3;

	for(int i = 1 ; i <= 4; i++ ){

		for(int j = 4; j >= i ; j-- ){

			System.out.print(x + " ");
			x++;

		}
		x = x - y;
		y--;
		System.out.println();
	}

    }
  }
