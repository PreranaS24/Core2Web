//Program to count Odd digits in a given number using while loop.
//
//
class ForLoop_OddDigitsCount{

	public static void main(String[] args){

	int N = 942111423;
	int oddcount = 0;
     
	for(int i = 0; N != 0 ; i++){
		  
		  if (((N%10)%2) != 0)
			oddcount++;

		  N = N/10;

      }
    
      System.out.println(oddcount);
	
	}
  }
