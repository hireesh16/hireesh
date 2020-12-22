package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7};
		Arrays.sort(num);
		System.out.println(num[num.length-2]);

	}

}
