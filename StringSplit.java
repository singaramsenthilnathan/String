public class StringSplit
{
  public static void main(String[] args)
  {
    String vowels = "a::b::c::d::e";
    String[] result = vowels.split("::");
    System.out.print("Vowels:");
 for(int i=0;i<result.length;i++)
 {
   	System.out.print(result[i]);
    }
}
}
