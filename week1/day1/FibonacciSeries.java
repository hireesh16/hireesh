package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=1;
		int sum;
		int range=8;
		System.out.println(firstNum);
		for(int i=1;i<range;i++)
		{
			sum=firstNum+secondNum;
			secondNum=firstNum;
			firstNum=sum;
			System.out.println(sum);
			
		}
	}

}
