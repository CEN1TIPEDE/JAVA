/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package doublylinkedlistwxample;

/**
 *
 * @author Student
 */
public class DoublyLinkedList {
    DLLnode head,tail;
    
    public DoublyLinkedList(){
        head = tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addToHead(Person p){
        //tom -> jack -> jim
        //ann ->  tom -> jack -> jim
        if(isEmpty()){
            head = tail = new DLLnode(p,null,null);
        }else{
            head = new DLLnode(p,head,null);
            head.next.prev = head;
            //tom node = head.next
        }
    }
    public void addToHead(int id, String name){
        Person p = new Person(id,name);
        this.addToHead(p);
    }
    
    public void addToTail(Person p){
        if(isEmpty()){
            head = tail = new DLLnode(p,null,null);
        }else{
            tail = new DLLnode(p,null,tail);
            tail.prev.next = tail;
        }
    }
    public void addToTail(int id,String name){
        Person p = new Person(id,name);
        this.addToTail(p);
    }
    public void printAllName(){
        for(DLLnode temp=head ; temp!=tail ; temp=temp.next){
            System.out.print(temp.pinfo.name + " -> ");
        }
        System.out.println(tail.pinfo.name);
    }
    public Person deleteFromTail(){
        Person p = null;
        if(!isEmpty()){
            p = tail.pinfo;
        }
        if(head == tail){// 1 node or no node
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
        return p;
    }
    public String getOldestPersonName(){
        int oldestAge = 0;
        String oldestMan ="";
        for(DLLnode temp=head ; temp != null ; temp=temp.next){
            if(temp.pinfo.age > oldestAge){
                oldestMan = temp.pinfo.name;
                oldestAge = temp.pinfo.age;
            }
        }
        return oldestMan;
    }
    public void swapHeadandTail(){//swap person info while list of node remain the same
        Person temp = head.pinfo;
        head.pinfo = tail.pinfo;
        tail.pinfo = temp;
    }
    public void swapHeadandTaiMovingPointer(){//move node while info is still the same
        if(head != tail){
            tail.next = head.next;
            DLLnode temp1 = tail.prev;
            tail.prev = null;
            head.next.prev = tail;
            head.next = null;
            head.prev = temp1;
            temp1.next = head;
            DLLnode temp2 = head;
            head = tail;
            tail = temp2;
        }
        
    }
}
