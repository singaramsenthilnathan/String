package test.second;
public class Arith
{
public static void main(String[] args)
{
	try
	{
	int[] arr = new int[8];
	for(int i=0;i<8;i++)
	{
		arr[0]=83;
		arr[1]=73;
		arr[2]=78;
		arr[3]=71;
		arr[4]=65;
		arr[5]=82;
		arr[6]=65;
		arr[7]=77;
	}
	for(int i=0;i<8;i++)
	{
	System.out.print((char)arr[i]+" ");
	}
	}
catch(ArrayIndexOutOfBoundsException aioe)
{
	System.out.println("Out Of Length");
	System.out.println(aioe.getMessage());
}
}
}
/* OUTPUT:
Out Of Length
Index 5 out of bounds for length 5
*/
/*OUTPUT:
S I N G A R A M 
*/
