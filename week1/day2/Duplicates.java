package week1.day2;

public class Duplicates {

	public static void main(String[] args) {
		int[] num = {14,12,13,11,15,14,18,16,17,19,18,17,20};
System.out.println(num.length);
int count;
for (int i=0; i<num.length-1;i++)
{
	count=0;
	for(int j=i+1;j<num.length;j++)
	{
		if(num[i]==num[j])
		{
		count=count+1;
			
		}
	}
	if(count>0)
	{
		System.out.println(num[i]);
	}

}


	}

}
