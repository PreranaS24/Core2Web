//Program to calculate Fcatorial of a given number using WhileLoop
//
//

class WhileLoop_Factorial{

	public static void main(String[] args){

	int fact = 1;
	int i = 1;
	int N = 6;

	while (i <= N){
		
		fact = fact * i;
		i++;
      }
          System.out.println(fact);
    }		
  }


