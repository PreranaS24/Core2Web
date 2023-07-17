//Program to count the digits of a given number
//
//
//
class WhileLoop_CountDigits{

	public static void main(String[] args){

		int N = 942111423;
		int count = 0;

		while(N != 0){
	
		count++;
		N = N/10;

      }

      	System.out.println(count);
    }
  }
