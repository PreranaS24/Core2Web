//Program to print the below pattern
//
/* F
 * E 1
 * D 2 E
 * C 3 D 4
 * B 5 C 6 D
 * A 7 B 8 C 9
 */

class Program7_F1ToC9_Pattern{

	public static void main(String[] args){

	char ch = 'F';
	int x = 1;

	for(int i = 1; i <= 6; i++ ){

		char cha = ch;

		for(int j = 1; j <= i ; j++){

			if(j%2 != 0) {
				System.out.print(cha + " " );
				cha++;
			}
			else {

				System.out.print(x + " ");
				x++;
			}
		}
		
		System.out.println();
		ch--;
	}
     }
  }


