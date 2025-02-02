class Cricketer{
	Cricketer(){
		System.out.println("Object is created");
	}
  	protected void finalize(){
		System.out.println("Object is destroyed");
	}
}
class CricketerDemo{
	public static void main(String args[])
	{
		Cricketer c = new Cricketer();
		c= null;
		System.gc();
	}
}