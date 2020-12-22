package week1.day1;

public class DataTypes {

	// TODO Auto-generated method stub
	 String carSize = "5 inches";
	 double fuelCapacity=12.56;
	public void driveCar() {
		int noWheels=4;
		System.out.println(noWheels);
		System.out.println("drive a car");

	}
public void applyBrake() {
	System.out.println("brake applied");

}

public static void main(String[] args) {
	DataTypes phone=new DataTypes();
	phone.driveCar();
	phone.applyBrake();
	System.out.println(phone.fuelCapacity);
	String size=phone.carSize;
	System.out.println(size);
	
}
		 
	}
