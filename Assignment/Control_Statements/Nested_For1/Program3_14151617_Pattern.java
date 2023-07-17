//Program to print the below pattern.
//
/* 14 15 16 17
 * 14 15 16 17
 * 14 15 16 17 
 * 14 15 16 17
 */
class Program3_14151617_Pattern{

	public static void main(String[] args){

		
	int k = 14;

	for(int i = 1; i <= 4; i++){

		for(int j = 1; j <= 4; j++){

			System.out.print(k + " ");
		}

		System.out.println();
		k++;
	}
    }
  }
