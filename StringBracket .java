package test;
import java.util.Scanner;
public class StringBracket 
{
	public static void main(String[] args) {
	    String valid ="((((()()()))))";
	    int count=0;
	    int a=0;
	    for(int i=0;i<valid.length();i++)
	    {
	      if(valid.charAt(i)=='(')//(
	        count++;
	      
	      else//
	        a++;
	    }
	    if(count==a)
	      System.out.println("valid");
	    else
	      System.out.println("invalid");
	}
	  }
