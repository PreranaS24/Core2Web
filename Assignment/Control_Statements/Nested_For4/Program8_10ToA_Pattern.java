//Program to print the below pattern
//
/* 10
 * I H
 * 7 6 5
 * D C B A
 */

class Program8_10ToA_Pattern{

	public static void main(String[] args){

		int x = 10;
		char ch = 'J';

		for(int i = 1; i <= 4; i++ ){

			for (int j = 1; j <= i ; j++ ){

				if(i%2 != 0){
					System.out.print(x + " ");
					x--;
					ch--;
				}
				else{
					System.out.print(ch + " ");
					x--;
					ch--;
				}
			}
		System.out.println();
     }
   }
 }
