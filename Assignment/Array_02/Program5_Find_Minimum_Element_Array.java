/*WAP to take size of array from user and also take integer elements from user.
 * Find the minimum element from the array.
 * 
 * Input : Enter size : 5
 * Enter array elements: 1 2 5 0 4
 *
 * Output: min element = 0
 *
*/
import java.util.*;

class Program5_Print_Minimum_Element_Array{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of an Array");

		int size = sc.nextInt();
		
		int arr[] = new int[size];

		System.out.println("Enter the elements of an Array");

		for(int j = 0 ; j<size ; j++){

			arr[j] = sc.nextInt();

		}


		int min = arr[0];

		for(int i = 0; i<size ; i++){

		if(arr[i] < min)

		min = arr[i];
		
		}
		
		System.out.println("Minimum element amongst the Array elements is " + min);

	}
  }
