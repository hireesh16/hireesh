package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int a=13;
		boolean b=false;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				b=true;
				break;
			}
		}
		
		if(b)
		{
			System.out.println(a+" is not prime number");
		
	}else
		System.out.println( a+" is prime number");

}
}
