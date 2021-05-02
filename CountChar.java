
public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cc = "If you obey all the rules";
//you miss all the fun"
int count =0;
for(int i=0;i<cc.length();i++)
{
	//if(cc.charAt(i) ==' ')
	if(cc.charAt(i) !=' ')
	count++;
}
System.out.println(count);
	}

}

/*OUTPUT
20*/
