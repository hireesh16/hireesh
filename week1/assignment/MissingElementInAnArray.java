package week1.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
	
		int[] arr= {11,12,14,15,17};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			int j=arr[i]+1;
			if(j!=arr[i+1])
			{
		System.out.println(j);
		//break;

	}

}
}
}

