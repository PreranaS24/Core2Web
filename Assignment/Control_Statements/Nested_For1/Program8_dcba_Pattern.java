//Program to print the below pattern.
//
/* d c b a
 * d c b a
 * d c b a
 * d c b a
 */
class Program8_dcba_Pattern{

	public static void main(String[] args){

	char ch = 'd';	

	for(int i = 0; i <= 3; i++){

		for(int j = 0; j <= 3; j++){

			System.out.print(ch + " ");
		       
		}

		System.out.println();
		ch--;
	}
    }
  }
