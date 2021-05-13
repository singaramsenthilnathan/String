package test.second;
public class Reverse 
{
public static void main(String[] args) 
{
String name ="singaramsenthilnathan";
char[] c = name.toCharArray();
int j=0;
char[] a = new char[c.length];
for(int i=c.length-1;i>=0;i--)
{
	a[j]=c[i];
	j++;
}
String name1 =new String(a);
System.out.println(name1);
}
}
