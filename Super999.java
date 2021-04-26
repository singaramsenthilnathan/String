
public class Super999 
{
public static void main(String[] args)
{
		String bankName = "SBI";
		System.out.println(bankName + "Hashcode"+ bankName.hashCode());
		
		String bankName1 = "SBI";
		System.out.println(bankName1 + "Hashcode"+ bankName1.hashCode());
		
		String bankName2 = "SBI";
		//System.out.println(bankName2 + "Hashcode"+ bankName2.hashCode());
		
		bankName2 = "BOB";
		System.out.println(bankName2 + "Hashcode"+ bankName2.hashCode());
		
		//bankName = "SBI";
		//System.out.println(bankName + "Hashcode"+ bankName.hashCode());
	}

}
