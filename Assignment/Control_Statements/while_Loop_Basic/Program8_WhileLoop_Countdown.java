//Program to print the Countdown of days for Assignment submission.
//
//
class WhileLoop_CountDown{

	public static void main(String[] args){

	int day = 7;

	while(day > 0){

		System.out.println(day + " Days remaining");
		day--;
	}

	if (day == 0)
		System.out.println(day + " days Assignment is Overdue");
    }
  }
