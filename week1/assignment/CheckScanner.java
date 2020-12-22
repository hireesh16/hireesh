package week1.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CheckScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length");
				int length=scan.nextInt();
				int[] arr = new int[length];
				System.out.println("enter values");
				int sum = 0,i;
				for (i=0;i<length;i++)
				{
					arr[i]=scan.nextInt();
					sum=sum+arr[i];		
					}
				System.out.println(Arrays.toString(arr));
				System.out.println(sum);

	}

}
