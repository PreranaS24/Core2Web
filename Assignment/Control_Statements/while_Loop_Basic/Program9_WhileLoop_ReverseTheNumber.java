//Program to reverse the given number
//
//

class WhileLoop_ReverseTheNumber{

	public static void main(String[] args){
	
		int num = 942111423;
		int rev = 0;

		while( num != 0) {
		
		int digit = num%10;
		rev = rev * 10 + digit;
		num = num/10;
      }
	System.out.println(rev);

    }
  }
