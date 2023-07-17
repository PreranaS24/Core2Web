//WAP to print sum of array elements
//
import java.util.*;

class Program1_SumOfArrayElements{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");
		
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		int sum = 0;
		
		System.out.println("Enter Array Elements");

		for(int i = 0 ; i<size ; i++){

			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of array elements is " + sum);

	}
   }

