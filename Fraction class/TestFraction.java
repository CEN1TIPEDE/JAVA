public class TestFraction {
    public static void main(String[] agrs){
        Fraction a = new Fraction(3,4);
        Fraction b = new Fraction(1,8);

        System.out.println(a.toString() + " add " + b.toString() + " = " + a.add(b));
        System.out.println(a.toString() + " substract " + b.toString() + " = " + a.substract(b));
        System.out.println(a.toString() + " multiply " + b.toString() + " = " + a.multiply(b));
        System.out.println(a.toString() + " divide " + b.toString() + " = " + a.divide(b));
    }
}
