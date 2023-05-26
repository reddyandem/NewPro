class Animal1{
	void makeSound()
	{
		System.out.println("Animals Makes souns:");
		
	}
}
class cat extends Animal1{
	void makeSound(){
		System.out.println("Cat Meoows");
	}
}
public class Animal 
{

	public void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal1 Animal1 = new Animal1();
		cat c=new cat();
		c.makeSound();
		Animal1.makeSound();
		}
}



