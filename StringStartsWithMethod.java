public class StringStartsWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringStartsWithMethod sm = new StringStartsWithMethod();
	sm.findstart();
	System.out.println(sm.findstart());
	}
public  boolean findstart()
{
String des ="Coronavirus is a common virus that causes an infection in your nose, sinuses, or upper throat";
String start ="Coronavirus";
int count=0;
for(int i=0;i<start.length();i++)
{
if(des.charAt(i)==start.charAt(i))
{
count++;
}
}
if(count==start.length())
return true;
return false;
}
}
