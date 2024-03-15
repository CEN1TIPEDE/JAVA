/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursionlab;

/**
 *
 * @author Student
 */
public class RecursionLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        print1ToN(10);
        System.out.println("");
        printOdd1ToN(10);
        System.out.println("");
        printOdd1ToN(100);//keep testing that it'll be even or odd
        System.out.println("");
        printOdd1ToN_v2(100);//garuntee that it is odd
        System.out.println("");
        System.out.println(gcd(60,24));
        System.out.println(recursiveGCD(60,24));
        System.out.println(divide(50,10));
        System.out.println(divide(-50,10));
        System.out.println(divide(50,-10));
        System.out.println(divide(50,0));
        System.out.println(log(64,2));
        System.out.println(palindome("aabbcbbaa"));
    }
    public static boolean palindome(String x){
        if(x.length()==1 || x.length()==0){return true;}
        return(x.charAt(0)==x.charAt(x.length()-1))
               &&palindome(x.substring(1,x.length()-1));
    }
    public static int log(int a, int base){
        if(a==1){return 0;}
        return log(a/base,base)+1;
    }
    public static int gcd(int n, int m){
        int smaller = (n<m ? n:m);
        for(int i = smaller ; i>1 ; i--){
            if(n%i == 0 && m%i == 0){return i;}}
        return 1;
    }
    public static int recursiveGCD(int n, int m){
        if(m == 0){ return(n); }
        return recursiveGCD(m,n%m);
    }
    public static int divide(int a , int b){
        if(a==0){return 0;}
        if((a>0 && b>0) || (a<0 && b<0)){return divide(a-b,b)+1;}
        if((a>0 && b<0) || (a<0 && b>0)){return divide(a+b,b)-1;}
        return -99999999;
    }
    public static void print1ToN(int n){
        //print last to make sure it'll be 1 first not 10 first
        if(n>0){ print1ToN(n-1);
            System.out.print(n + " ");}
    }
    public static void printOdd1ToN(int n){
        if(n>0){
            if(n%2 == 1){printOdd1ToN(n-2);
                System.out.print(n + " ");
            }else{printOdd1ToN(n-1);}
        }
    }
    public static void printOdd1ToN_v2(int n){
        if(n>0){
            if(n%2 == 0){printOdd1ToN_v3(n-1);
            }else{printOdd1ToN_v3(n);}
        }
    }
    public static void printOdd1ToN_v3(int n){
        if(n>0){printOdd1ToN_v3(n-2);
            System.out.print(n + " ");}
    }
    
}
