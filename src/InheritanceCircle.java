class circle{
	
	double radii;
	
	circle()
	{
		System.out.println("In the circle constructor");
	}
	circle(double radii){
		this.radii=radii;
	}
	void Area()
	{
		double area;
		
		area= 3.14*this.radii*this.radii;
		System.out.println("Area of the circle is: " + area);
	}
	
	
}
class cylinder extends circle{
	double height;
		
	cylinder(double r, double h){
		super(r);
		this.height=h;
		
	}
	void Volume()
	{
		double Vol;
		
		Vol= 3.14*this.radii*this.radii*this.height;
		System.out.println("Volume of the cylinder is: " + Vol);
	}
}




public class InheritanceCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder cy1= new cylinder(10,25);
		cy1.Volume();
		cy1.Area();
		
	}

}
