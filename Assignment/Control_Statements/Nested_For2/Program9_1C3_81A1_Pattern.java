//Program to print the below pattern
//
/* 1C3   4B2   9A1
 * 16C3  25B2  36A1
 * 49C3  64B2  81A1
 */

class Program9_1C3_81A1_Pattern{

	public static void main(String[] args){

		int x = 1;
		
		for(int i = 1; i <= 3 ; i++){

			int k = 3;
			char ch = 'C';

			for(int j = 1; j <= 3 ; j++){

				System.out.print(x*x + "" + ch + "" + k + " ");
				x++;
				ch--;
				k--;
			}
			System.out.println();
		}
    }
  }
