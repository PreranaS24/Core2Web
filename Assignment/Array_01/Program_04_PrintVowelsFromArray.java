//WAP to print vowels from Array
//
import java.io.*;

class Program4_PrintVowelsFromArray{

	public static void main(String[] args)throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter Size of Array");

	int size = Integer.parseInt(br.readLine());
	
	char arr[] = new char[size];

		for(int j = 0; j<size ; j++){

			arr[j] = (char)br.read();
			br.skip(1);
		}

		for(int i=0 ; i<size ; i++){ 
 
			if((arr[i] == 'a') || (arr[i] == 'e') || (arr[i] == 'o') || (arr[i] == 'i') || (arr[i] == 'u'))
				System.out.println(arr[i]);

		}

	}
 }
