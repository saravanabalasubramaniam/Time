import java.io.*;
import java.util.*;
class Time
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("enter the minutes:");
	long min=input.nextInt();
	long hr=min/60;
	long minute=min%60; 
	System.out.println("the time in hours is:"+hr+" "+minute+"hrs");
	}
}
