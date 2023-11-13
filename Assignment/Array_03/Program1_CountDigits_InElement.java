/*WAP to print count of digits in elements of array.
 *
 * Input : Enter Array Elements : 02 255 2 1554
 *
 * Output : 2 3 1 4
 *
 */

class Program1_CountDigits_InElement{

	public static void main(String[] args){

		int arr[] = new int[]{02,255,2,1554};

		for(int i = 0 ; i<arr.length; i++){

			int count = 0;
			
			int temp = arr[i];

			System.out.println("Array element is " + temp);

			while(temp != 0){

				count++;
				temp = temp/10;
				System.out.println(temp);
				System.out.println("Count is " + count);
		}

		System.out.println(count);
	    }		
	 }
    }
