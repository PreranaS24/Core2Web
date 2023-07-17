//WAP to find the numbers of even and odd elements of an array
//
import java.util.*;

class Program6_Print_Maximum_Element_Array{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of an Array");

		int size = sc.nextInt();
		
		int arr[] = new int[size];

		System.out.println("Enter the elements of an Array");

		for(int j = 0 ; j<size ; j++){

			arr[j] = sc.nextInt();

		}


		int max = arr[0];

		for(int i = 0; i<size ; i++){

		if(arr[i] > max)

		max = arr[i];
		
		}
		
		System.out.println("Maximum element amongst the Array elements is " + max);

	}
  }
