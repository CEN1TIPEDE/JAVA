/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randomaccessfilelab;

/**
 *
 * @author Student
 */
public class Equiment {
    private int id;
    private int amount;
    private String name;
    private String model;
    private String otherInfo;
    private double price;
    
    
    public Equiment(int id){
        this.id=id;
    }
    public Equiment(int id , String name,int amount , String model ,double price, String otherInfo){
        this.id=id;
        this.amount=amount;
        this.name=name;
        this.model=model;
        this.otherInfo=otherInfo;
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public int getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
    public String getOtherInfo(){
        return otherInfo;
    }

    public double getPrice() {
        return price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}
