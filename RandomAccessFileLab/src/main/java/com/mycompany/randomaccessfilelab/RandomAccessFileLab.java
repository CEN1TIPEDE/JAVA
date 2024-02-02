/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.randomaccessfilelab;

/**
 *
 * @author Student
 */
public class RandomAccessFileLab {

    public static void main(String[] args) {
        Equiment device1 = new Equiment(120,"Switch",10,"SW1",300,"Black");
        ListOfEquiment dataFile1 = new ListOfEquiment("device.dat");
//        dataFile1.addEquiment2File(device1);
//        dataFile1.readId();
//        dataFile1.printAllDeviceName();
        dataFile1.readDevice(120);
    }
}
