//Program to print reverse order if the number is even or to print reverse order by a difference of two if odd.
//
//

class WhileLoop_EvenOddReverse{

	public static void main(String[] args){

		int n = 7;//6;
		int i = n;

		while(n > 0){

			if (i%2 == 0){
				System.out.println(n);
				n--;
			}
			else{
				System.out.println(n);
				n=n-2;
			}


	  }
	}
  }
