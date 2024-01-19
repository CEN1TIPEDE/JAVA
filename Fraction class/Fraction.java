public class Fraction{
    public int num;
    public int num2;
    public int n;
    public int n2;
    public int ans;
    
    //constructor
    public  Fraction(int num, int num2,int n,int n2,int ans){
        this.num = num;
        this.num2 = num2;
        this.n=n;
        this.n2=n2;
        this.ans=ans;
    }

    //methods
    public int add(){
        ans = (num/num2) + (n/n2);
        return ans;
    }

    public int substract(){
        ans = (num/num2) - (n/n2);
        return ans;
    }

    public int multiply(){
        ans = (num/num2) * (n/n2);
        return ans;
    }

    public int divide(){
        ans = (num/num2) / (n/n2);
        return ans;
    }

    public int reduce(){
        //odd number
        if(num/2 != 0 || num2/2 != 0 || n/2 != 0 || n2/2 != 0){
            
        }

        //even number
        else if(num/2 == 0 || num2/2 == 0 || n/2 == 0 || n2/2 == 0){

        }

    return ans;
    }

    // public void printFraction1(int num, int num2){
    //     System.out.print(num + "/" + num2);
    // }

    // public void printFraction2(int n, int n2){
    //     System.out.print(n + "/" + n2);
    // }
}