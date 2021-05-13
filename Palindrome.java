package test.second;
public class Palindrome
{
public static void main(String[] args) 
{
String name ="madam";
char[] c = name.toCharArray();
int j=0;int count=0;
char[]a =new char[c.length];
for(int i=c.length-1;i>=0;i--)
{
a[j]=c[i];
j++;
}
for(int i=0;i<c.length;i++)
{
if(name.charAt(i)==a[i])
{
	count++;
}
}
if(count==name.length())
{
	System.out.println("It is Palindrome");
}
else
{
System.out.println("It is not");
}
}
}
