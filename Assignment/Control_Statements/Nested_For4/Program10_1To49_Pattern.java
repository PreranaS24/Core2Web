//Program to print the below pattern
//
/* 1
 * 8   9
 * 9  64 25 
 * 64 25 216 49
 */

class Program10_1To49_Pattern{

	public static void main(String[] args){

		int z = 1;

		for(int i = 1; i <= 4; i++ ){

			int x = z;

			for (int j = 1; j <= i ; j++ ){

				if(x%2 != 0){
					System.out.print(x*x + " ");
					x++;
				}
				else{
					System.out.print(x*x*x + " ");
					x++;
				}
			}
		System.out.println();
		z++;
     }
   }
 }
