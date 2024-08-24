
public class Test {

	public static void main(String[] args) {
		mystery(123456);
	}
	
	public static void mystery(int x)

	{

	  if ((x / 10) != 0)

	  {

	    mystery(x / 10);

	  }

	 

	  System.out.print(x % 10);

	}

}
