import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*; 
 /*<applet code="AppletLifeCycle.class" width="350" height="150"> </applet>*/ 
public class AppletLifeCycle extends Applet
{
	public void init()
	{
		System.out.println("Initialize an Applet");
	}
	public void start()
	{
		System.out.println("Start an Applet");		
	}
	public void paint()
	{	
		System.out.println("Welcome to Applet");	
	}
	public void stop()
	{
		System.out.println("Stop an Applet");
	}
	public void destroy()
	{
		System.out.println("Applet Destroyed");
	}
}