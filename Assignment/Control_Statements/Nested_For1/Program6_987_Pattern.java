//Program to print the below pattern.
//
/* 9 8 7
 * 9 8 7
 * 9 8 7 
 * 9 8 7
 */
class Program6_987_Pattern{

	public static void main(String[] args){

		

	for(int i = 1; i <= 3; i++){


	     int k = 9;

		for(int j = 1; j <= 3; j++){

			System.out.print(k + " ");
		        k--;
		}

		System.out.println();
	}
    }
  }
