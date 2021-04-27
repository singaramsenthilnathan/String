public class StringOwnMethods {

	public static void main(String[] args) 
{
		StringOwnMethods som = new StringOwnMethods();
		som.findlength();
}
public void findlength()
{
String name = "PAYILAGAM";
char c[]=name.toCharArray();
int count =1;
int i=0;
while(c[i]>=0)
{
	count++;
	i++;
	if(c[i]=='M')
	break;
}
System.out.println(count);

}
}
