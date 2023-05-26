
class veeraReddy{
	String sonName;
	String dauName;
	int age;
	
	veeraReddy()
	{
		sonName="andem";
		dauName="teja";
		age=78;
		System.out.println("Parent class constructor executed");
	}
	veeraReddy(String sonName, String dauName, int age){
		this.sonName =sonName;
		this.dauName = dauName;
		this.age = age;
	}		
	}
class prudhviDhar extends veeraReddy{
	
		
	String x;
	String y;
	int z;
	//prudhviDhar(){
	//	super();
	//}
	prudhviDhar(String x, String y, int z)
	{
		super(x,y,z);
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	void disp()
	{
		System.out.println(sonName);
		System.out.println(dauName);
		System.out.println(age);
	}
	
}
class Teja extends veeraReddy{
	
	
}
public class App {
	public static void main(String[] args){
		//prudhviDhar ver = new prudhviDhar();
		//ver.disp();
		prudhviDhar ver2 = new prudhviDhar("andem","reddy",89);
		ver2.disp();
		System.out.println("Working");
	}

}
