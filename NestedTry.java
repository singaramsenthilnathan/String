package test.second;
import java.lang.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry 
{
public static void main(String[] args) 
{
NestedTry nt = new NestedTry();
nt.methodcall();
}

public void methodcall() 
{
try
{
try
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Roll No");
int rollno = sc.nextInt();
}
catch(InputMismatchException ime)
{
	System.out.println("Enter String Type");
	System.out.println(ime);
	ime.printStackTrace();
	System.out.println(ime.getMessage());
	
}
try
{
	int n1=10;
	int n2=0;
	n2=n1/n2;
}
catch(ArithmeticException ae)
{
	System.out.println("Check Divisor");
	System.out.println(ae);
	ae.printStackTrace();
	System.out.println(ae.getMessage());
}
}
catch(Exception ex)
{
	System.out.println("Trapped Exception");
	System.out.println(ex);
	System.out.println(ex.getMessage());
	ex.printStackTrace();
}
}
}
