//Program to print the below 1 to 7 pattern
//
/* 1 2 3 4
 * 4 5 6
 * 6 7
 * 7
 */
class Program10_1to7_Pattern{

	public static void main(String[] args){

		int z = 1;

	for(int i = 1; i <= 4; i++){

		for(int j = 4; j >= i ; j--){

			System.out.print(z + " ");
			z++;
		}
			z--;
			System.out.println();
	}


    }
  }
