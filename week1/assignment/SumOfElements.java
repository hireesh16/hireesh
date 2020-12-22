package week1.assignment;

public class SumOfElements {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		
int sum = 0;

//for(int i=0;i<num.length;i++)
for (int i : num) 
{
	//sum= sum+num[i];
	sum=sum+i;
}
System.out.println(sum);

	}

}
