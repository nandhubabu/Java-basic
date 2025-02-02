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
class ItalianChef extends Chef
{
	public void makeSpecialDish()//overrriding methods
	{
		System.out.println("The Cheif makes a eggplant parm");
	}
	public void makePasta()
	{
		System.out.println("The Cheif makes a special Pasta");
	}
        
}
class ChineseChef extends Chef
{
	public void makeSpecialDish()//overrriding methods
	{
		System.out.println("The Cheif makes a orange chicken");
	}
	public void makeFriedRice()
	{
		System.out.println("The Cheif makes a special FriedRice");
	}
        
}
public class InheritanceExtend
{
	public static void main(String args[])
	{
		Chef normalChef=new Chef();
		ItalianChef itChef= new ItalianChef();
		ChineseChef chChef = new ChineseChef();
		normalChef.makeChicken();
		normalChef.makeSalad();
		normalChef.makeSpecialDish();
		itChef.makeChicken();
		itChef.makeSalad();
		itChef.makeSpecialDish();
		itChef.makePasta();
		chChef.makeChicken();
		chChef.makeSalad();
		chChef.makeSpecialDish();
		chChef.makeFriedRice();
	}
}