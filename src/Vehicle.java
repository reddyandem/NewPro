class vehicle1{
	void drive(){
		System.out.println("Car Starting");
	}
}
class car extends vehicle1{
	void drive(){
		System.out.println("Repairing Car");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle1 v = new vehicle1();
		v.drive();
		car c = new car();
		c.drive();
	}

}
