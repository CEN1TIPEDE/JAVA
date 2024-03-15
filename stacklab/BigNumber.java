/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacklab;

/**
 *
 * @author Student
 */
public class BigNumber {
    String number;
    
    //constructor
    public BigNumber(String number) {this.number = number;}
    //int concat w/ "" ==> String
    public BigNumber(int number) {this.number = number+"";}
    
    //methods
    public int length(){return this.number.length();}
    public String toString(){return this.number;}
    
    public BigNumber add(BigNumber number2){
        MyStack op1 = new MyStack(this.length());
        MyStack op2 = new MyStack(number2.length());
        int resultLength = 
            (this.length() > number2.length()? 
             this.length():number2.length())+1;
        MyStack result = new MyStack(resultLength);
        
        //stack of op1 at index 0 and so on
        for(int i = 0 ; i<this.length() ; i++){
            op1.push(this.number.charAt(i)-48); //ASCII code num 0 = 48
        }
        for(int i = 0 ; i<number2.length() ; i++){
            op2.push(number2.toString().charAt(i)-48);//same as op1
        }
        
        int carry = 0;
        while(!op1.isEmpty() || !op2.isEmpty()){
            int a = (op1.isEmpty()? 0 : op1.pop()) +
                    (op2.isEmpty()? 0 : op2.pop()) +
                    carry;
            result.push(a%10);//keep back digit /ex. 12 keep 2
            carry = a/10; //keep front digit /ex. 12 keep 1
        }
        if(carry > 0){result.push(carry);}
        String ans = "";
        
        //pop value out and then concat from left to right
        while(!result.isEmpty()){
            ans = ans + result.pop();//String = int = String
        } 
        return new BigNumber(ans);
    }
    
}
