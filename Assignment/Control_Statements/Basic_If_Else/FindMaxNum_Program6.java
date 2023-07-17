//Program to check Maximum Number between three numbers.
//
//
//
class Max_Amnong_Three{
	
	public static void main(String[] args){

		int x = 42;//78 trial
		int y = 38;//78 trial
		int z = 42;//78 trial

		if (( x > y ) && ( x > z ))
			System.out.println(x + " is greatest amnongst " + y + " " + z );
		else if ( y > z )
			System.out.println(y + " is greatest amongst " + x + " " + z);
		else
			System.out.println(z + " is greatest amongst " + x + " " + y);
    }
  }
