public class Rep {

  public static void main(String[] args)
  {
  String ss="singaramsenthil";
  char []cc=ss.toCharArray();
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
  
   
for(int i=1,j=0;i<cc.length-1;i++)
{
  int count=1;
  if(cc[i-1]==cc[i+j])
  {
  count++;
  System.out.println(cc[i]+" "+count);    

  }
  else
  
  {
    
  }
}

  }

}
public class Letter {
