package week1.assignment;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] arr= {4,6,4,2,9,2,8,10};
		Arrays.sort(arr);
		int count;
		
	for(int i=0; i<arr.length;i++)
	{
		count=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count=count+1;
			}
				
		}
		if(count==0)
		{
			System.out.println(arr[i]);
		}
	}
		

	}

}
