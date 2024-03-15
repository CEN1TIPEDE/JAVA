/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortinglab;

/**
 *
 * @author Student
 */
public class Data {
    int[] data;
    
    public Data(int[] orgData){
//        this.data=orgData; //refer to
        this.data=orgData.clone(); //clone to new data
    }
    
    public void printAll(){
    for(int i = 0 ; i<data.length ; i++){
        System.out.print(data[i]+" ");
    }
    System.out.println("");
    }
    
    public void swap(int p, int q){
        int temp = data[p];
        data[p] = data[q];
        data[q] = temp;
    }
    
    //sort like a poping bubble
    public void bubbleSort(){
        for(int i = 0; i < data.length-1 ; i++){
            for(int j = data.length-1 ; j>i ; j--){
                if(data[j] < data[j-1]){
                    swap(j,j-1);
                }
            }
        }
    }
    
    //33 34 66 70 => insert 32 
    //32 ... 66 70 (copy backward)
    public void insertionSort(){
        for(int i =1 ; i<data.length ; i++){
            int temp = data[i];
            int j;
            for(j = i-1 ; j>=0 && data[j] > temp ; j--){
                data[j+1] = data[j];
            }
            data[j+1] = temp;
        }
    }
    
    public void selectionSort(){
        for(int i = 0; i<data.length-1 ; i++){
            int smallestIndex = i;
            for(int j = i+1 ; j<data.length ; j++){
                if(data[j]<data[smallestIndex]){
                    smallestIndex=j;
                }
            }
            swap(i,smallestIndex);
        }
    }
    public void shellSort(){
        for(int shell = 5 ; shell>= 1 ; shell-=2){
            //in here is similar to insertion sort
            //not every 1 item but every shell item
            for(int i = shell ; i<data.length; i+=shell){
            int temp = data[i];
            int j;
            for(j = i-shell ; j>=0 && data[j] > temp ; j-=shell){
                data[j+shell] = data[j];
                }
            data[j+shell] = temp;
            }
        }
    }
    
    public void quickSort(int first ,int last){
     if(first >= last){//anchor to stop recursion
         return;
     }
     int pivot = first;
     int left = first + 1 ,right = last;
     while(left <= right){
         while(left <= last && data[left] < data[pivot]){
             //left searchs for data that is bigger than data at pivot
             left++;
         }
         while(right >= first+1 && data[right] >= data[pivot]){
             //right searchs for data that is smaller than data at pivot
             right--;
         }
         if(left < right){
             swap(left,right);
             left++; right--;
         }
     }
     swap(pivot,right);
     quickSort(first, right-1);//subproblem on the left of the pivot
     quickSort(right+1, last);//subproblem on the right of the pivot
    }
  
    
}
