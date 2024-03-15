/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinkedlistwxample;

/**
 *
 * @author Student
 */
public class Person {
    int id;
    String name;
    int age;
    String gender;
    double height, weight;

    public Person(int id, String name, int age, String gender, double height, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public Person(int id, String name) {
        this(id,name,0,"",0,0);
    }
    
    
}
