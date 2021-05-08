public class Strmethod {

  public static void main(String[] args) {
  String aa = "Vidya_Is_Best";
  String cc=" she wins";
char [] as =aa.toCharArray();

System.out.println("the char at 3th index "+aa.charAt(3));
System.out.println("the length of string "+aa.length());
System.out.println("the substring "+aa.substring(6));
System.out.println("the substring for specific part "+aa.subSequence(0, 5));
System.out.println("joining two string "+aa.concat(cc));
System.out.println("finding the first occurrence "+aa.indexOf('i'));
System.out.println("finding the first occurrence "+aa.indexOf('s', 8));//it will start searching 's' from 8 and tells the first occurrences
System.out.println("finding thr last occurrence "+aa.lastIndexOf('i'));
System.out.println("find that 2 two are equal "+aa.equalsIgnoreCase(cc));//it ignore the case differences
System.out.println("find that 2 two are equal "+aa.equals(cc));
System.out.println("change the whole into lowercase "+aa.toLowerCase());
System.out.println("change the whole into uppercase "+aa.toUpperCase());
System.out.println( "trim where space are there "+aa.trim());
System.out.println("replace the char "+aa.replace('a', 'o'));
System.out.println("check whether char is there "+cc.contains(cc));
System.out.println(aa.startsWith("Vidya"));
System.out.println(cc.endsWith("wins"));
  for(int i=0;i<as.length;i++)
  {
    System.out.println("String into char "+as[i]);
    
  }
  
}
}
