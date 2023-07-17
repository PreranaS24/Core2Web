//Program to type 1 to 216 in below Pattern.
/* 1
 * 8 27  
 * 64 125 216 
 * D C B A
 */

class Program9_1to216_Pattern{

	public static void main(String[] args){

	int x = 1;

	for(int i = 1 ; i <= 3 ; i++){

		for(int j = 1 ; j <= i ; j++){
                
			System.out.print(x*x*x + " " );
			x++;
		}
		System.out.println();
	}


          }
	}
