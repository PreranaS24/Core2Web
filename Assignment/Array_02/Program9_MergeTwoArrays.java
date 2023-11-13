//WAP to merge two arrays into one
// 
// Array1 = [10,20,30,40,50]
// Array2 = [9,18,27,36,45]
//
// Output :
// Merged Array = [10,20,30,40,50,9,18,27,36,45]
// Hint : You can take 3rd array.
//

import java.io.*;
class Program9_MergeTwoArrays{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array 1 Size ");
			
		int size1 = Integer.parseInt(br.readLine());

		int arr1[] = new int[size1];

		System.out.println("Enter Array 1 elements");

		for(int i = 0 ; i<size1 ; i++){

			arr1[i] = Integer.parseInt(br.readLine());

		}

		System.out.println("Enter Array 2 Size ");
			
		int size2 = Integer.parseInt(br.readLine());

		int arr2[] = new int[size2];

		System.out.println("Enter Array 2 elements");

		for(int i = 0 ; i<size2 ; i++){

			arr2[i] = Integer.parseInt(br.readLine());

		}

		int arr3[] = new int[size1 + size2];

		System.out.println(arr3.length);

		for(int i = 0 ; i<size1 ; i++){

			arr3[i] = arr1[i];
		}

		for(int i = 0 ; i<arr2.length ; i++){

			arr3[size1 + i] = arr2[i];
			

		}

		System.out.println("Merged Array 3 is ");

		for(int i = 0; i<arr3.length ; i++){

			System.out.println(arr3[i]);
		}
	}
}
