//Program to get sum of all even numbers and multiplication of all odd numbers between 1 to 10.
//
//
//
class WhileLoop_SumEven_OddMulti{

	public static void main(String[] args){

	int i = 1;
	int sum = 0;
	int multi = 1;

	while(i <= 10){

		if(i%2 == 0)
			sum = sum + i;
		else
			multi = multi * i;

		i++;
	}
	System.out.println(sum);
	System.out.println(multi);
    }
 }
