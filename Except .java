package test.second;
public class Except 
{
public static void main(String[] args) 
{
Except e = new Except();
e.divide(30,0);
}
public void divide(int i, int j) 
{
try
{
int result = i/j;
System.out.println(result);
}
catch(ArithmeticException ae)
{
System.out.println("Check Divisior");
System.out.println(ae.getMessage());
}
}
}
