//WAP to find common elements between two arrays

class Program7_CommonElementsBetweenTwoArrays{

	public static void main(String[] args){

	
		int arr1[] = {1,2,3,5};
		int arr2[] = {2,1,9,8};

		for(int i = 0 ; i<arr1.length ; i++){

			for(int j = 0; j<arr2.length ; j++){

				if(arr1[i] == arr2[j]){

					System.out.println("Common Element is " + arr1[i]);
					break;
				}
			}
		}
	}
  }



