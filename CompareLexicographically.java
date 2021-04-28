public class CompareLexicographically {
  public static void main(String[] args) {
    
    String firstString = "Paneer";  //14  
    String secondString = "Paneer";//15
    String thirdString = "Butter";//1
    String fourthString = "Cheese";//2 //1
    
    System.out.println("Comparing two strings lexicographically.");
    
    //System.out.print("\nCompairing character sequence of the firstString ("+firstString+") to the character sequence of the secondString ("+secondString+") returns: ");
    System.out.println(firstString.compareTo(secondString));
    
    //System.out.print("\nCompairing character sequence of secondString ("+secondString+") to the character sequence of thirdString ("+thirdString+") returns: ");
    System.out.println(secondString.compareTo(thirdString));
    
    //System.out.print("\nCompairing character sequence of thirdString ("+thirdString+") to the character sequence of fourthString ("+fourthString+") returns: ");
    System.out.println(thirdString.compareTo(fourthString));
    
    //System.out.print("\nCompairing character sequence of fourthString ("+fourthString+") to the character sequence of firstString ("+firstString+") returns: ");
    System.out.println(fourthString.compareTo(firstString));    
  }
}
