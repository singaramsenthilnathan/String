package test.second;
import java.util.Scanner;
public class Arithmetic
{
public static void main(String[] args) 
{
Arithmetic a = new Arithmetic();
Scanner sc = new Scanner(System.in);
System.out.println("Enter Divide Value");
int n1 = sc.nextInt();
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter Divisior Value");
int n2 = sc1.nextInt();
a.divide(n1,n2);
}
public void divide(int n1, int n2) 
{
try
{
int result =n1/n2;
System.out.println(result);
}
catch(ArithmeticException ae)
{
System.out.println("Check Divisior");
System.out.println(ae.getMessage());
}
}
}
