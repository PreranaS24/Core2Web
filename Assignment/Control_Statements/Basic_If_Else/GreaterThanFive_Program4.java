//Program to check given number Greater than  four or not and print accordingly
//
//

class GreaterThanFour_Check{

	public static void main(String[] args){

	//int var = 4;
//	int var = 6;
	int var = -6;

	if(var>5){
		System.out.println("Number is Greater than 5");
	}
	else{
		switch(var){
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			default:
				System.out.println("Negative Number");
				break;
		}
	}
    }
  }
