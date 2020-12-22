package week1.assignment;

public class SquareValue {

	public static void main(String[] args) {
		int[] arr1= new int[] {1,2,3,4,5};
		int[] arr2= new int[arr1.length] ;
		System.out.println("{");
		for(int i=0;i<arr2.length;i++)
		{
		arr2[i]=arr1[i]*arr1[i];
		System.out.print(arr2[i]+",");
		}
		System.out.println("}");

	}

}
