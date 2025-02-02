import java.io.*;
import java.sql.*;

public class dbnoframe
{
	Connection con;
	Statement stmt;
	ResultSet rs;

	int f1;
	String rno,uname,uage,umob,msgc,data;
	
	String ch2;
	int ch3;
	
	public dbnoframe()
	{
		

		try
		{	
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:mydsn");
			stmt=con.createStatement();
		
			Scanner br=new Scanner(System.in);
			
			do
			{

				System.out.println("Enter your choice");
				System.out.println("1. Insert");
				System.out.println("2. Select");
				System.out.println("3. Delete");
				System.out.println("4. Update");
				System.out.println("5. Exit");

				String st=br.readLine();
				int n=Integer.parseInt(st);
			
				switch(n)
				{
					case 1: System.out.println("Enter Rollno: ");
						rno=br.readLine();
						System.out.println("Enter Name: ");
						uname=br.readLine();
						System.out.println("Enter Age: ");
						uage=br.readLine();
						System.out.println("Enter Mobile: ");
						umob=br.readLine();
						
						f1=stmt.executeUpdate("insert into student(rollno,nam,age,mobile)values('"+rno+"','"+uname+"','"+uage+"','"+umob+"')");
						if(f1>0)
						{
							System.out.println("Inserted Successfully");
						}
						
						break;

					case 2:	System.out.println("Enter Rollno: ");
						rno=br.readLine();
						rs=stmt.executeQuery("select * from student where rollno='"+rno+"'");
						if(rs.next())	
						{		
							
							System.out.println(rs.getString(2));
				
							
							System.out.println(rs.getString(3));
							
							System.out.println(rs.getString(4));
										
						}
						else
						{
							System.out.println("No data available");
						}
						
						break;

					case 3:	System.out.println("Enter Rollno: ");
						rno=br.readLine();
						f1=stmt.executeUpdate("delete from student where rollno='"+rno+"'");
						if(f1>0)
						{
							
							System.out.println("Row Deleted..");
						}
						
						break;

					case 4:	System.out.println("Enter Rollno: ");
						rno=br.readLine();
						System.out.println("Enter Age: ");
						uage=br.readLine();
						f1=stmt.executeUpdate("update student set age='"+uage+"' where rollno='"+rno+"'");
						if(f1>0)
						{
							
							System.out.println("Updated Successfully..");
						}
						
						break;

					case 5:	System.exit(0);
				
				}

				System.out.println("DO you want to continue..(1/2)?");
				ch2=br.readLine();
				ch3=Integer.parseInt(ch2);

			}while(ch3==1);

		}
		catch (Exception ex)
		{ 
			System.out.println(ex);
		}
     	}

	public static void main(String args[])
	{
		new dbnoframe();
		
	}


}



