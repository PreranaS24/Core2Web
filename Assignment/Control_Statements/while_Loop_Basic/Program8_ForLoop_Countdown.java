//Program to print the Countdown of days for Assignment submission.
//
//
class ForLoop_CountDown{

	public static void main(String[] args){

	int day = 7;

	for(; day > 0 ; day --){

		System.out.println(day + " Days remaining");
	}

	if (day == 0)
		System.out.println(day + " days Assignment is Overdue");
    }
  }
