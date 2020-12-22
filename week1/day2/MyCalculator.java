package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator output= new Calculator();
		output.add();
		output.sub();
		float ans =output.div(12, 10);
		System.out.println(ans);
		double que =output.mul(2, 4);
		System.out.println(que);
		
	}

}
