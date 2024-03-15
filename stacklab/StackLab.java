/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stacklab;

/**
 *
 * @author Student
 */
public class StackLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack st1 = new MyStack(10);
        st1.push(5);st1.push(15);
        st1.push(88);st1.push(333);
        st1.push(30);st1.push(29);
        st1.pop();st1.pop();st1.pop();st1.pop();
        st1.push(50);st1.push(130);
        st1.push(22);st1.push(52);
        st1.push(20);st1.push(39);
        System.out.println(st1.topEl());
        System.out.println(st1.size());
        
//        String x = "456";
//        System.out;println((x.charAt(0)-48) +10);
        
        String x = "3333333333333333333" 
                    + "3333333333333333333"
                    + "3333333333333333333";
        BigNumber n1 = new BigNumber(x);    
        String y = "111111111111" 
                    + "111111111111"
                    + "111111111111"
                    + "111111111111"
                    + "111111111111";
        BigNumber n2 = new BigNumber(y);
        BigNumber n3 = n1.add(n2);
        System.out.println(n3);
        String d = "6666666666666666666666666666"
                    + "6666666666666666666666666666"
                    + "6666666666666666666666666666"
                    + "6666666666666666666666666666";
        BigNumber n4 = new BigNumber(d);
        n1 = n3.add(n4);
        System.out.println(n1.toString());
        
    }
}
