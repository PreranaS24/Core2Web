//Program to count the digits of a given number using For loop.
//
//
//
class ForLoop_CountDigits{

	public static void main(String[] args){

		int N = 942111423;
		int count = 0;
		
		for(int i = 0; N != 0; i++){
	
		N = N/10;
		count++;

      }

      	System.out.println(count);
    }
  }
