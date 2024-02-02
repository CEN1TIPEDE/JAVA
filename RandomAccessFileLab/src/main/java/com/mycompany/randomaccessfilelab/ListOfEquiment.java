/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randomaccessfilelab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class ListOfEquiment {
    RandomAccessFile pointer;
    String fileName;
    
    public ListOfEquiment(String fileName){
        this.fileName=fileName;
    }
    public void addEquiment2File(Equiment device){
        try {
            pointer = new RandomAccessFile(fileName,"rw");
            pointer.seek(pointer.length());//move pointer to the end of file
            pointer.writeInt(device.getId());
            
            byte[] deviceName = new byte[20];
            deviceName=device.getName().concat("                     ").getBytes();
            pointer.write(deviceName,0,20);
            pointer.writeInt(device.getAmount());
            
            byte[] deviceModel = new byte[20];
            deviceModel = device.getModel().concat("                    ").getBytes();
            pointer.write(deviceModel, 0, 20);
            pointer.writeDouble(device.getPrice());
            
            byte[] deviceInfo = new byte[100];
            deviceInfo = device.getOtherInfo().concat(" ".repeat(100)).getBytes();
            pointer.write(deviceInfo, 0, 100);
            pointer.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListOfEquiment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListOfEquiment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void readId(){
        try {
            pointer = new RandomAccessFile(fileName,"r");
            int x =0;
            for(int i = 0 ; pointer.getFilePointer() < pointer.length() ; i++){
                x = pointer.readInt();
                System.out.print(x+" ");
                pointer.seek((i+1)*156);
            }
            pointer.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListOfEquiment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListOfEquiment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void printAllDeviceName(){
        try {
            pointer = new RandomAccessFile(fileName,"r");
            pointer.seek(4);//avoid int id
            String devName = "";
            for(int i = 0 ; pointer.getFilePointer() < pointer.length(); i++){
                byte[] dName = new byte[20];
                pointer.read(dName, 0, 20);
                System.out.print(new String(dName).trim() + ", ");
                pointer.seek((i+1)*156 +4);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListOfEquiment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListOfEquiment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void readDevice(int deviceId){
        try {
            pointer = new RandomAccessFile(fileName, "r");
            int id = 0;
            int amount;
            String name, model ,info;
            double price;
            for(int i = 0 ; pointer.getFilePointer() < pointer.length() ; i++){
                id = pointer.readInt();
                if(id == deviceId){
                    byte[] temp = new byte[100];
                    //read name of the device
                    pointer.read(temp, 0, 20);
                    name = new String(temp).trim();
                    //read amount of the device
                    amount = pointer.readInt();
                    //read model of the device
                    pointer.read(temp, 0, 20);
                    model = new String(temp).trim();
                    //read price(double)
                    price = pointer.readDouble();
                    //read other info
                    pointer.read(temp, 0, 100);
                    info = new String(temp).trim();
                    
                    System.out.println(id + " " + name + " " + amount + " " + model + " " + price + " " + info);
                }
               pointer.seek((i+1)*156);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListOfEquiment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListOfEquiment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
