//Program to type  1to 10 in below Pattern.
/* 1
 * 2 3 
 * 4 5 6
 * 7 8 9 10
 */

class Program2_1To10_Pattern{

	public static void main(String[] args){

	int x = 1;	

	for(int i = 1 ; i <= 4 ; i++){

		for(int j = 1 ; j <= i ; j++){

			System.out.print(x + " " );
			x++;

		}

		System.out.println();
	}


          }
	}
