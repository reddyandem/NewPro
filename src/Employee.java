class Employee1
{
	void work(){
		System.out.println("Working");
}
	void getSalary()
	{
		System.out.println("salary");
	}
}
class hrManager extends Employee1
{
	void work(){
		System.out.println("Working in hr class");
	}
	void addEmployee(){
		System.out.println("Adding new employee");
	}
}



public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hrManager hr = new hrManager();
		hr.work();
		hr.addEmployee();
		hr.getSalary();

	}

}
