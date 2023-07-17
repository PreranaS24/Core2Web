//Program to type J to A in below Pattern.
/* J
 * I H  
 * G F E 
 * D C B A
 */

class Program8_JtoA_Pattern{

	public static void main(String[] args){

		        char ch = 'J';	

	for(int i = 1 ; i <= 4 ; i++){

		for(int j = 1 ; j <= i ; j++){
                
			System.out.print(ch + " " );
			ch--;
		}
		System.out.println();
	}


          }
	}
