/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublylinkedlistwxample;

/**
 *
 * @author Student
 */
public class DoublyLinkedListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person(1,"Tom",20,"M",120,60);
        DoublyLinkedList dlist1 = new DoublyLinkedList();
        dlist1.addToHead(p1);
        System.out.println(dlist1.head.pinfo.name);
        System.out.println(dlist1.tail.pinfo.name);
        dlist1.addToHead(1,"Jack");
        //Jack -> Tom
        System.out.println(dlist1.head.pinfo.name 
                + "->" + dlist1.tail.pinfo.name
                + "("+ dlist1.head.next.pinfo.name + ")");
        dlist1.addToTail(3,"Jim");
        dlist1.addToTail(4,"Jane");
        //Jack -> Tom -> Jim -> Jane
        System.out.println(dlist1.tail.pinfo.name);
        System.out.println(dlist1.tail.prev.pinfo.name);
        dlist1.printAllName();
        dlist1.head.pinfo.age = 30;
        dlist1.head.next.next.pinfo.age = 40;
        dlist1.tail.pinfo.age = 24;
        System.out.println(dlist1.getOldestPersonName());
//        dlist1.deleteFromTail();
//        dlist1.printAllName();
        dlist1.swapHeadandTail();
        dlist1.printAllName();
        dlist1.swapHeadandTaiMovingPointer();
        dlist1.printAllName();
        
    }
    
}
