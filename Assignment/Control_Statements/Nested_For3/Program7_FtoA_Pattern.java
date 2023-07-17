//Program to type  F to A in below Pattern.
/* F
 * E F  
 * D E F 
 * C D E F
 * B C D E F
 * A B C D E F
 */

class Program7_FtoA_Pattern{

	public static void main(String[] args){


	char ch = 'F';

	for(int i = 1 ; i <= 6 ; i++){

		        char cha = ch;	

		for(int j = 1 ; j <= i ; j++){
                       
			System.out.print(cha + " " );
			cha++;
		}
		ch--;
		System.out.println();
	}


          }
	}
