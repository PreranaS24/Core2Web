//WAP to find the numbers of even and odd elements of an array
//
import java.util.*;

class Program4_SearchElement_PrintIndex_Array{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of an Array");

		int size = sc.nextInt();
		
		int arr[] = new int[size];

		System.out.println("Enter the elements of an Array");

		for(int j = 0 ; j<size ; j++){

			arr[j] = sc.nextInt();

		}

		System.out.println("Enter the element to be searched");

		int num = sc.nextInt();

		for(int i = 0; i<size ; i++){

		if(arr[i] == num)

			System.out.println("The index of " + num + " is " + i);
		}


	}
  }
