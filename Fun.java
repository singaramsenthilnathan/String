public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Fun().callmethod();
}
	String ss = "Java is Fun";
	char[] cc = ss.toCharArray();
	int i=0;
	private void callmethod() {
		// TODO Auto-generated method stub
	while(i<cc.length)
	{
		if(cc[i]=='a'||cc[i]=='e'||cc[i]=='i'||cc[i]=='o'||cc[i]=='u')
		{
		cc[i]='x';
		}
		i++;
	}
	for(int j=0;j<cc.length;j++)
	{
		System.out.print(cc[j]);
	}
	System.out.println();
	}

}
/* OUTPUT:
 * Jxvx xs Fxn
 */
