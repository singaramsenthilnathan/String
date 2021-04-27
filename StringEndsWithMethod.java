public class StringEndsWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringEndsWithMethod se = new StringEndsWithMethod();
	se.findends();
	System.out.println(se.findends());
	}
public  boolean findends()
{
String des ="Coronavirus is a common virus";
String end ="virus";
int count=0;
int j = des.indexOf("v");
for(int i=0;i<end.length();i++)
	
{
	if(des.charAt(j)==end.charAt(i))
	{
		count++;
	}
	j++;
}
if(count==end.length())
return true;
return false;
	}

}
