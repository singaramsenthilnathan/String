public class StringLower 
{
public static void main(String[] args) 
{
String name = "SINGARAM";
char c[]=name.toCharArray();
//Caps to Small Letter Conversion
for(int i =0;i<name.length();i++)
{
c[i]=(char) (c[i]+32);
}
//Printing Converted String
for(int i =0;i<name.length();i++)
{
System.out.print(c[i]);
}
}
}
