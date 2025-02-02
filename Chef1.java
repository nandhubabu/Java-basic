class Chef
{
	public void makeChicken()
	{	
		System.out.println("The Cheif makes a delicious Chicken");
	}
	public void makeSalad()
	{
		System.out.println("The Cheif makes a healthy Salad");
	}
	public void makeSpecialDish()
	{
		System.out.println("The Cheif makes a special bbq");
	}
}
public class Chef1
{
	public static void main(String args[])
	{
		Chef normalChef=new Chef();
		normalChef.makeChicken();
		normalChef.makeSalad();
		normalChef.makeSpecialDish();
	}
}