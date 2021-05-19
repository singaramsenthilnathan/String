package test.second;
import java.lang.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
public static void main(String[] args) 
{
MultipleCatch mc = new MultipleCatch();
mc.getdetails();
}

public void getdetails() 
{
try
{
	
	for(int i=0;i<5;i++)
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Scanner sc1 = new Scanner(System.in);
		int ID = sc1.nextInt();
		int EmpSalary[] = new int[5];
		EmpSalary[i]=10000;
		System.out.println(EmpSalary[i]);
		
	}
}
catch(InputMismatchException e)
{
	System.out.println("Type Mismatch");
	getdetails();
}
catch(Exception ae)
{
	System.out.println("Array out of bounds");
	getdetails();
}
finally
{
	System.out.println("Close Program");
}
}
}
/* OUTPUT:
 Raja
1234
10000

Vimal
1235
10000

Subu
1236
10000

Vignesh
1237
10000

Tamil
1238
10000
*/
