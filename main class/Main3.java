public class Main3{
  public static void main(String[] args)
  {
    /*
    String s1 = new String("ILOVEYOU");
    String s2 = "Iloveyou";
    System.out.println(s1==s2);
    */
    /*
    String s1 = new String("BANANAPEPSI");
    String s2 = "BananaPepsi";
    s2 = s1;
    System.out.println(s1==s2);
    */
    String s1 = new String("BANANAPEPSI");
    String s2 = "BananaPepsi";
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));
  }
}