//Program to print the below pattern
//
/*  26 Z 25 Y
 *  24 x 23 W
 *  22 V 21 U
 *  20 T 19 S
 */

class Program5_26ZTo19S_Pattern{

  	public static void main(String[] args){

		int x = 26;
		char ch = 'Z';

		for(int i = 1 ; i <= 4 ; i++){
			
			for(int j = 1; j <= 4; j++){

				if(j%2 != 0){
					System.out.print(x + " ");
                                        x--;
				}
				else{ 
					System.out.print(ch + " ");
					ch--;
				}
			}
			System.out.println();

		}

    }
  }
