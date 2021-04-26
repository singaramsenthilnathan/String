public class Super8 
{
public static void main(String[] args)
{
String bankName = new String("SBI");	
System.out.println(bankName.hashCode());

String bankName1= new String("SBI");
System.out.println(bankName1.hashCode());

String bankName2 = new String("sbi");	
System.out.println(bankName2.hashCode());

}

}
