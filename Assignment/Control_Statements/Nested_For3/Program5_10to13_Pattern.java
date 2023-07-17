//Program to type C2W below Pattern.
/* 10 10 10 10 
 * 11 11 11
 * 12 12 
 * 13
 */

class Program5_10to13_Pattern{

	public static void main(String[] args){

	int x = 10;

	for(int i = 1 ; i <= 4 ; i++){

		for(int j = 4 ; j >= i ; j--){

			System.out.print(x + " ");
			
		}
		x++;
		System.out.println();
	}


          }
	}
