/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortinglab;

/**
 *
 * @author Student
 */
public class SortingLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {56,22,99,40,66,23,15,34,200,4,11,9,15,-7};
        Data d1 = new Data(arr);
        System.out.println("Selection sort : ");
        d1.printAll();
        d1.selectionSort();
        d1.printAll();
        
        Data d2 = new Data(arr);
        System.out.println("Insertion sort : ");
        d2.printAll();
        d2.insertionSort();
        d2.printAll();
        
        Data d3 = new Data(arr);
        System.out.println("Bubble sort : ");
        d3.printAll();
        d3.bubbleSort();
        d3.printAll();
        
        Data d4 = new Data(arr);
        System.out.println("Shell sort : ");
        d4.printAll();
        d4.shellSort();
        d4.printAll();
        
        Data d5 = new Data(arr);
        System.out.println("Quick sort : ");
        d5.printAll();
        d5.quickSort(0, d5.data.length-1);
        d5.printAll();
    }
    
}
