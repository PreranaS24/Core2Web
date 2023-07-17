//Program to check whether the given number is pallindrome or not
//
//

class WhileLoop_PallindromeNumber{

	public static void main(String[] args){
	
		int num = 2332;//942111423;
		int temp = num;
		int rev = 0;

		while( num != 0) {
		
		int digit = num%10;
		rev = rev * 10 + digit;
		num = num/10;
      }

	if(temp == rev)
               System.out.println(temp + " is a Pallindrome number");
	else
               System.out.println(temp + " is not a Pallindrome number");

    }
  }
