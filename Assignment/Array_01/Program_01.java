//WAP to take size of array from user and also take integer elements from user Print sumof odd elements only.
import java.io.*;

class Odd_Element_Sum{

	public static void main(String[] args) throws IOException{

		System.out.println("Enter Size of Elements");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br1.readLine());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[size];

		int sum = 0;

		for(int i =0; i < size; i++){
			
		arr[i] = Integer.parseInt(br.readLine());

		}

		for(int i=0; i < size ; i ++){
		
		//System.out.println(arr[i]);
		if(arr[i]%2!=0)
		sum = sum + arr[i];

		}

		System.out.println("Sum of Array Elements is " + sum);

	}
  }
