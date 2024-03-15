/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinkedlistwxample;

/**
 *
 * @author Student
 */
public class DLLnode {
    Person pinfo;
    DLLnode next, prev;

    public DLLnode(Person pinfo, DLLnode next, DLLnode prev) {
        this.pinfo = pinfo;
        this.next = next;
        this.prev = prev;
    }

    public DLLnode(int pid , String pname) {
        this.pinfo=new Person(pid,pname);
        this.next = null;
        this.prev =null;
    }

    public DLLnode(int pid , String pname ,DLLnode next, DLLnode prev) {
        this.pinfo = new Person(pid ,pname);
        this.next = next;
        this.prev = prev;
    }
    
    
}
