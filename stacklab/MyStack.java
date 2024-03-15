/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacklab;

/**
 *
 * @author Student
 */
public class MyStack {
    private int[] info;
    private int top;
    
    //constructure
    public MyStack(int capacity) {
        info = new int[capacity];
        top = 0;
    }
    
    //method
    public void push(int newInfo){
        if(!isFull()){
            info[top] = newInfo;
            top++;
        }
    }
    public int pop(){
        int x = -1;
        if(!isEmpty()){
            top--;
            x = info[top];
        }
        return x;
    }
    public int topEl(){
        int x = -1;
        if(!isEmpty()){
            x = info[top-1];
        }
        return x;
    }
    public boolean isEmpty(){ return top == 0; }
    public boolean isFull(){ return top == info.length; }
    public int size(){
        return top;
    }
}
