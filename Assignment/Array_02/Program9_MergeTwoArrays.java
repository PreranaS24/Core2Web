//WAP to merge two arrays into one
//
import java.io.*;
class Program9_MergeTwoArrays{

	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array 1 Size ");
			
		int size1 = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];

		System.out.println("Enter Array 1 elements"):

		for(int i = 0 ; i<size1 ; i++){

			arr1[i] = Integer.parseInt(br.readLine());

		}

		System.out.println("Enter Array 2 Size ");
			
		int size2 = Integer.parseInt(br.readLine());

		int arr2[] = new int[size];

		System.out.println("Enter Array 2 elements"):

		for(int i = 0 ; i<size2 ; i++){

			arr2[i] = Integer.parseInt(br.readLine());

		}

		int arr3[] = new int[size1 + size2];

		for(int i = 0 ; i<size1 ; i++){

			arr3[i] = arr1[i];
		}

