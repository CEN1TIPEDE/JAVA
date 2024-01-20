import java.util.Scanner;
public class Main2{
  public static void main(String[] args)
  {
    /*
    String w1 = new String("Good Morning");
    String w2 = "I love banana pepsi";
    System.out.println(w1);
    System.out.println(w2);
    */
  
    String w1 = new String("Good Morning");
    String w2 = "I love banana pepsi";
    System.out.println(w2.length());
    System.out.println(w2.charAt(3));
    System.out.println(w2.concat(w1));
    System.out.println(w2.indexOf("a"));
    System.out.println(w2.indexOf("a", 7));
    System.out.println(w2.substring(3));
    System.out.println(w2.substring(3, 6));
    
  }
}