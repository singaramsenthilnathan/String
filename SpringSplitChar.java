class SpringSplitChar {
  public static void main(String[] args) {
    String name = "R+a+j+a";
    String[] result = name.split("\\+");
 System.out.print("Name : ");
 for(int i=0;i<result.length;i++)
 {
	 System.out.print( result[i]);
 }
  }
}
