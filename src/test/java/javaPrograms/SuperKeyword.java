package javaPrograms;
//SuperKeyword this word is used to refer immediate parent class variable,method and constructor
class aaa
{
	String dogcolor="white";
	void displayColor()
	{
		System.out.println(dogcolor);
	}
	
	void Eat()
	{
		System.out.println("Dog is eating ");
	}
	
	aaa()
	{
		System.out.println("this constructor from abc class");
	}
}
class ccc extends aaa
{
	String dogcolor="Black";
	void displayColor()
	{
		System.out.println(super.dogcolor);
	}
	
	void Eat()
	{
		super.Eat();
		System.out.println("Dog is eating bread---------");
	}
	
	//constructor
	ccc()
	{
		//System.out.println("this constructor is from xyz-----");
		super();
		}
	
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		ccc    x= new ccc();
		//x.displayColor();
		x.Eat();
		
		ccc cc= new ccc();
		


	}

}
