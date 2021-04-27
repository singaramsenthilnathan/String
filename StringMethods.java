public class StringMethods 
{
public static void main(String[] args) {
// TODO Auto-generated method stub
String s = "Beigneer";
String s1 =" Singaram";
String s2 =" Payilagam is the Best software Training institute  ";
System.out.println(s.length());//to check string length
System.out.println(s.charAt(3));//to check the particular position,we want.
                          //Index Number
System.out.println(s.substring(3));//BEIGNEER
                                   //01234567
                                   //   34567
System.out.println(s.substring(3, 6));//BEIGNEER
                                      //01234567
                                      //   345
System.out.println(s.concat(s1));//adding to strings
System.out.println(s.indexOf("e"));// to check the index of particular position
System.out.println(s1.indexOf("a"));
System.out.println(s.indexOf("e", 2));
//i-search string,9-start position for search
System.out.println(s.lastIndexOf("e"));//index of last occurence
System.out.println("PAYILAGAM".equals("PAYILAGAM"));//Compare two Strings
System.out.println(s.equals(s1));
System.out.println("PAYILAGAM".equals("Payilagam"));
System.out.println("PAYILAGAM".equalsIgnoreCase("Payilagam"));
System.out.println(s.toLowerCase());// Converts to LowerCase
System.out.println(s.toUpperCase());// Converts to UpperCase
System.out.println(s2.trim());
//System.out.println(s2.replace("Best","Better"));
String s3 =s2.trim();
System.out.println(s3.replace("Best","Better"));//old char,new char
String s4 =s3.replace("Best","Better");
int output =s1.compareTo(s3);
System.out.println(output);
System.out.println(s1.compareTo(s3));
System.out.println(s4.contains("Better"));//to check or word 
System.out.println(s2.startsWith(" Payilagam"));
System.out.println(s2.endsWith("institute  "));//




}


}
