package week1.day2;

public class Armstrong {

	public static void main(String[] args) {
		int org=153;
		int temp;
		int cal = 0;	
		int rem;
		temp=org;
		while(org>0)
		{
			rem=org%10;
			org=org/10;
			cal=cal+(rem*rem*rem);
			
		}
		if(temp==cal)
		{
			System.out.println("Armstrong Number");
		}else
		{
			System.out.println("not armstrong");
		}
		

	}

}
