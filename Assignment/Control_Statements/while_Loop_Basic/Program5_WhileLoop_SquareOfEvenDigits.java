//Program to print Square of Even Digits of given number.
//
//

class Whileloop_SquareOfEvenDigits{

	public static void main(String[] args){

	int N = 942111423;

//	for(int i = 0 ; i <= N ; i++){a

	while(N != 0){

//	System.out.println(N%10);

	if(((N%10)%2) == 0){

	int even_num = N%10;
	System.out.println(even_num*even_num);	
	  
	}

	N = N/10;
	}
    }
  }
