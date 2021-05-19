package test.second;
import java.lang.Exception;
public class Throw1
{
public static void main(String[] args)
{
ThrowsExample t = new ThrowsExample();
try
{
t.demo1();
}
catch(Exception ae)
{
	System.out.println(ae);
	System.out.println(ae.getMessage());
	ae.printStackTrace();
}
}

}
