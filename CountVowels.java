public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount=0,ccount=0;
		String cv = "Counter variable to store the count of vowels and consonant";
		cv =cv.toLowerCase();
for(int i=0;i<cv.length();i++)
{
if(cv.charAt(i)=='a'||cv.charAt(i)=='e'||cv.charAt(i)=='i'||cv.charAt(i)=='o'||cv.charAt(i)=='u')
{
vcount++;			
}
else if(cv.charAt(i)>='a' && cv.charAt(i)<='z')
{
ccount++;
}
}
System.out.println("Number Of Vowels :" + vcount);
System.out.println("Number Of Consonants :" + ccount);
}
}
/* OUTPUT:
 * Number Of Vowels :20
Number Of Consonants :30*/
