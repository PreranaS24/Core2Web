//Program to print the below pattern.
//
/* 1 2 3 4
 * 2 3 4 5
 * 3 4 5 6
 * 4 5 6 7
 */
class Program10_1234567_Pattern{

	public static void main(String[] args){

	for(int i = 1; i <= 4; i++){

		int k = i;

		for(int j = 1; j <= 4; j++){

			System.out.print(k + " ");
			k++;
		}
		System.out.println();
	}
    }
  }
