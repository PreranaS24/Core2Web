//Program to check whether the given number is pallindrome or not.
//
//

class ForLoop_Pallindrome{

	public static void main(String[] args){
	
		int num = 2332;//942111423;
		int temp = num;
		int rev = 0;

		for( ; num != 0 ; ) {
		
		int digit = num%10;
		rev = rev * 10 + digit;
		num = num/10;
      }

	if (temp == rev)
	        System.out.println(temp + " ia a Pallindrome Number");
	else
		System.out.println(temp + " is not a Pallindrome Number");

    }
  }
