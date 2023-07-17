//Program to print the below pattern
//
/* F 5 D 3 B 1
/* F 5 D 3 B 1
/* F 5 D 3 B 1
/* F 5 D 3 B 1
/* F 5 D 3 B 1
/* F 5 D 3 B 1
 */

class Program10_F5D3B1_Pattern{

	public static void main(String[] args){

	for(int i = 1; i <= 6 ; i++){

	    char ch = 'F';
	    int x = 5;

	    for ( int j = 1; j <= 6; j++){

		    if(j%2 != 0){
			    System.out.print(ch + " ");
			    ch--;
			    ch--;
		    }
		    else{
			    System.out.print(x + " ");
			    x=x-2;
		    }
	    }

	    System.out.println();
	}


   }
 }
