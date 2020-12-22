package week1.assignment;

public class AverageNumberArray {

	public static void main(String[] args) {

int[] numbers = new int[]{20, 30, 25, 35, 16, 60, 100};
double sum=0;
for(int i=0; i<numbers.length;i++)
{

	sum=sum+numbers[i];
	
}
System.out.println(sum);
double Average= sum/numbers.length;
System.out.println(Average);

	}

}
