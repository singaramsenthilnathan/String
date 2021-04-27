public class StringCases 
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
String words ="SSINGARAMmech9971#$%@";//to print Capital Letters
char c[]=words.toCharArray();
for(int i=0;i<words.length();i++)
{
if(c[i]>='A' && c[i]<='Z')
	System.out.print(c[i]);
}
//small letters
for(int i=0;i<words.length();i++)
{
if(c[i]>='a' && c[i]<='z')
	System.out.print(c[i]);
}
System.out.println();
//numbers
for(int i=0;i<words.length();i++)
{
if(c[i]>='0' && c[i]<='9')
	System.out.print(c[i]);
}
System.out.println();
//special characters
for(int i=0;i<words.length();i++)
{
if(c[i]>='0' && c[i]<='9')
continue;
else if((c[i]>='A'&& c[i]<='Z')||(c[i]>='a'&&c[i]<='z'))
continue;
	System.out.print(c[i]);
}
System.out.println();
//caps and small letters
for(int i=0;i<words.length();i++)
{
if(words.toLowerCase().charAt(i)>='a' && words.toLowerCase().charAt(i)<='z')
	System.out.print(c[i]);
}
System.out.println();
for(int i=0;i<words.length();i++)
{
if(words.toUpperCase().charAt(i)>='A' && words.toUpperCase().charAt(i)<='Z')
	System.out.print(c[i]);
}

}
}
