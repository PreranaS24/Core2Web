/*WAP to print the elements whose addition of digits is even.
 * Ex: 26 = 2 + 6 = 8 ( 8 is even so print 26 )
 *
 * Input:
 * Enter array: 1 2 3 5 15 16 14 28 17 29 123
 *
 * Output:
 * 2 15 28 17 123
 *
 */

class Program10_AdditionDigits_Even{
		
	public static void main(String[] args){

	int arr[] = new int[]{1,2,3,5,15,16,14,28,17,29,123};

	for(int i = 0; i<arr.length ; i++){

		int sum = 0;

		int temp = arr[i];

		while(arr[i] != 0){
		
			int digit = arr[i]%10 ;
			sum = sum + digit;
			arr[i] = arr[i]/10;
		}
		
			if(sum %2 == 0)
				System.out.println(temp);
		
		    }

   		}		
 	 }
