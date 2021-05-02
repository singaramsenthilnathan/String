import java.util.Arrays;
public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sa ="Brag";
String sb ="Grab";
sa = sa.toLowerCase();
sb = sb.toLowerCase();

if(sa.length()!=sb.length())
{
	System.out.println("Both the Strings are NotEqual");
}
else
{
	char[] string1 = sa.toCharArray();
	char[] string2 = sb.toCharArray();
	
	Arrays.sort(string1);
	Arrays.sort(string2);

if(Arrays.equals(string1, string2)==true)
{
System.out.println("Both the Strings are Anagram");
}
else
{
System.out.println("Both the Strings are Not Anagarm");
}
}
}
}
/* OUTPUT:
 * Both the Strings are Anagram
 */
