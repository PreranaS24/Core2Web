//WAP to find common elements between two arrays

class Program8_UnCommonElementsBetweenTwoArrays{

	public static void main(String[] args){

	
		int arr1[] = {1,2,3,5};
		int arr2[] = {2,1,9,8};

		int flag = 0;

		System.out.println("Uncommon Elements are : ");

		for(int i = 0 ; i<arr1.length ; i++){

			for(int j = 0; j<arr2.length ; j++){

				if(arr1[i] == arr2[j]){

					flag = 1;	
				}
			}
				
				if(flag == 0)
				{
					System.out.println(arr1[i]);
					
				}

				flag = 0;

		}


		for(int i = 0 ; i<arr2.length ; i++){

			for(int j = 0; j<arr1.length ; j++){

				if(arr1[j] == arr2[i]){

					flag = 1;	
				}

			}
				
				if(flag == 0)
				{
					System.out.println(arr2[i]);

				}

				flag = 0;

		}			


	}
  }



