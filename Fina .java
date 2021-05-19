package test.second;
public class Fina 
{
public static void main(String[] args) 
{
try
{
int []a = new int [4];
for(int i=0;i<4;i++)
{
System.out.println(a[i]=i);
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
finally
{
	System.out.println("All is Well");
}
}
}
