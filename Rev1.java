package test;
public class Rev1
{
public static void main(String[] args) 
{
String st="SingaramSenthil";
char[] ch=st.toCharArray();

for(int i=ch.length-1;i>=0;i--)//15-1//14>0
{
System.out.print(ch[i]);//l//
}
}
}
