package test.second;
//import java.lang.Exception;
import java.util.Scanner;

public class ThrowsExample 
{
public static void main(String[] args) throws Exception 
{
ThrowsExample t = new ThrowsExample();
t.demo1();
try
{
t.demo();
}
catch(Exception e)
{
	System.out.println(e);
	System.out.println(e.getMessage());
	e.printStackTrace();
}
}
public void demo()throws Exception
{
	int[]arr = new int[4];
arr[-2]=-4;
}
public void demo1()throws Exception
{
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
}
}
