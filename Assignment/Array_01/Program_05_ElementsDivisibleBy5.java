//WAP to print Product of even elements of Array
//
import java.io.*;
class Program5_ElementsDivisibleBy5_Array{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		for(int i = 0; i<size ; i++){

			arr[i] = Integer.parseInt(br.readLine());

		}
		
		System.out.println("Array Elements which are divisible by 5 are ");


		for(int j = 0; j<size ; j++){
		
			if(arr[j]%5 == 0)
				System.out.println(arr[j]);
			}
		}
	}

