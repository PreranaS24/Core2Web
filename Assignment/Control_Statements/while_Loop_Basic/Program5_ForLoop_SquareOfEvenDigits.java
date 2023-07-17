//Program to print Square of Even Digits of given number.
//
//

class Forloop_SquareOfEvenDigits{

	public static void main(String[] args){

	for(int N = 942111423; N != 0 ; N = N/10){

	if(((N%10)%2) == 0){

	int even_num = N%10;
	System.out.println(even_num*even_num);	
	  
	}

	}
    }
  }
