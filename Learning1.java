class Learning1
{
 public static void main(String[] args)
{
System.out.println("before changing " +args[0]+args[1]);
   int a = Integer.parseInt(args[0]); 
  float b = Float.parseFloat(args[1]);
  Integer aa = a;
  Float ab = b;
  System.out.println(aa+ab);
System.out.println("after changing " + (a+ b));
System.out.println("after changing " +args[2]);
String s = String.valueOf(a);
String s1 = String.valueOf(b);
System.out.println("after changing to string " + (s+s1));
}
}
