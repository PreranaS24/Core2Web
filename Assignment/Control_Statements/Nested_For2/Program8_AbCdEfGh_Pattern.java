//Program to print thew below pattern
//
//
/* A b C d
 * E f G h
 * I j K l
 * M n O p
 * */

class Program8_AbCdEfGhIj_Pattern{

	public static void main(String[] args){

    		int x = 1;
		//char ch = 'A';
		int ch = 65;

		for(int i = 1 ; i <= 4 ; i++ ){

			for(int j = 1; j <= 4; j++){

				if( x%2 != 0){
					char cha = (char)ch;
					System.out.print(cha +" ");
				}
				else{
				        int chi = ch + 32;
					char cha = (char)chi;
					System.out.print(cha +" ");
				}
				ch++;
				x++;
			}
			System.out.println();
		}
	
	}
  }
