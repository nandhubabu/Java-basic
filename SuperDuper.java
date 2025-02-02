class Person 
{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void man()
	{
		System.out.print("I am a person");
	}
}
class Hero extends Person
{
	String power;
	Hero(String name,int age,String power)
	{
    		super(name,age);
		this.power=power;
	}
        public void man1()
	{
                super.man();
		System.out.println(" with some powers");
	}
}
public class SuperDuper
{
 	public static void main(String args[])
	{
		Hero hero1= new Hero("Batman",42,"Money");
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);
             	hero1.man1();

	}
}
