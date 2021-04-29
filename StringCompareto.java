
public class StringCompareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompareto sct = new StringCompareto();
		sct.programiz();
		sct.programequal();
		sct.programwithcase();
		sct.programwithinteger();
		
	}
public void programiz()
	{
		String str1 = "Learn Java";
        String str2 = "Learn Java";
        String str3 = "Learn Kolin";
        int result;
        result = str1.compareTo(str2);
        System.out.println("Str1 compareto str2 : "+ result); // 0
        result = str1.compareTo(str3);
        System.out.println("Str1 compareto str3 : "+result); // -1
        result = str3.compareTo(str1);
        System.out.println("Str3 compareto str1 : "+result); // 1
	}
	public void programequal()
	{
		String st1 = "Learn Python";
        String st2 = "Learn Java";
        if (st1.compareTo(st2) == 0) {
            System.out.println("st1 and st2 are equal");
        }
        else {
            System.out.println("st1 and st2 are not equal");
        }
	}
	private void programwithcase()
	{
		// TODO Auto-generated method stub
		    String str1 = "Learn Java";
	        String str2 = "learn Java";
	        int result;
	        result = str1.compareTo(str2);
	        System.out.println("Upper and Lower Case Difference: "+ result); // -32
	}
	public void programwithinteger()
	{
		Integer x = 5;
	      
	      System.out.println("Variable compareto Given Value :"+ x.compareTo(3));
	      System.out.println("Variable compareto Given Value :"+ x.compareTo(5));
	      System.out.println("Variable compareto Given Value :"+ x.compareTo(8));    
	}
}
