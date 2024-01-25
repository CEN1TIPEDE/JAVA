public class Fraction{
    int n;
    int d;
    
    //constructor
    public  Fraction(int numerator, int denominator){
        n = numerator;
        d = denominator;;
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
    public static String reduce(int n, int d){
        int gcd = gcd(n, d);
        int newN = n/gcd;
        int newD = d/gcd;
        return newN + "/" + newD;
    }

    //methods
    public String toString(){
        return n + "/" + d;
    }

    public String add(Fraction f){
        int newN = this.n * f.d + f.n * this.d;
        int newD = this.d * f.d;
        String answer = reduce(newN,newD);
        return answer;
    }

    public String substract(Fraction f){
        int newN = this.n * f.d - f.n * this.d;
        int newD = this.d * f.d;
        String answer = reduce(newN,newD);
        return answer;
    }

    public String multiply(Fraction f){
        int newN = this.n * f.d;
        int newD = this.d * f.d;
        String answer = reduce(newN,newD);
        return answer;
    }

    public String divide(Fraction f){
        int newN = this.n * f.d;
        int newD = this.d * f.n;
        return newN + "/" + newD;
    }
}