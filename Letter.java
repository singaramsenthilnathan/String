public class Letter {

public static void main(String[] args) 
{
  String s1="singaramsenthil";
  char[] cc = s1.toCharArray();
  int[] bb = new int[cc.length];
  for(int i=0;i<cc.length;i++)
  {
    for(int j=0;j<cc.length;j++)
    {
      if(cc[j]>cc[i])
      {
        char temp = cc[i];
                 cc[i] = cc[j];
                 cc[j] = temp;
      }
    }
  }
  System.out.println(cc);
    for(int j = 0;j<cc.length;j++)
      {
      char no = cc[j];//a
      int count = 1; 
      for(int i=j+1; i<cc.length; i++)
      {
        if(no==cc[i])//a==a 
        {
          count++;//2
          bb[i] = -1; 
        }
      }
      if(bb[j]!=-1)
      {
       // bb[j] = count; //bb[0]=2
    System.out.println(cc[j] + " count is " + count); 

}
      }
}
}
