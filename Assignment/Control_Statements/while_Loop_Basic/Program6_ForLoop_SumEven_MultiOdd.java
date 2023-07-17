//Program to get sum of all even numbers and multiplication of all odd numbers between 1 to 10.
//
//
//
class ForLoop_SumEven_OddMulti{

	public static void main(String[] args){

	int sum = 0;
	int multi = 1;

	for(int i =1 ; i <= 10 ; i++){

		if(i%2 == 0)
			sum = sum + i;
		else
			multi = multi * i;

	}
	System.out.println(sum);
	System.out.println(multi);
    }
 }
