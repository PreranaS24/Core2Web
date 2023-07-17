//WAP to print Product of even elements of Array
//
import java.io.*;
class Program2_ProductOfEvenElements_Array{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int multi = 1;

		for(int i = 0; i<size ; i++){

			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2 == 0){
			multi = multi * arr[i];
			}

		}

		System.out.println(multi);

		}
	}

