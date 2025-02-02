class Finally
{
  public static void main(String[] args)
  {
    int a[] = new int[2];
    System.out.println("out of try");
    try
    {
      System.out.println("Access invalid element"+ a[4]);
      /* the above statement will throw ArrayIndexOutOfBoundException */
    }
    finally
    {
      System.out.println("finally is always executed.");
    }
  }
}