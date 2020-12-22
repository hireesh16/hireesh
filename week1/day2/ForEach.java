package week1.day2;

import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		
		int[] num= {12,5,7,3,7};
		Arrays.sort(num);
		for (int i : num)
		{
			System.out.println(i);
				}
}
}
