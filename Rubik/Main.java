package Rubik;

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int[][][] rubik = {
    	{   {1,10,19},
            {2,11,20},
            {3,12,21} 
        },
        {   {4,13,22},
            {5,14,23},
            {6,15,24}
        },
        {   {7,16,25},
            {8,17,26},
            {9,18,27}}
        };

        int num = sc.nextInt();
        String[] arrstr = new String[num];
        int[] arrn = new int[num];

        for(int i=0 ; i<num ; i++)
        {
            arrstr[i] = sc.next();
            arrn[i] = sc.nextInt();
        }
        
        for(int i=0 ; i<3 ; i++)
        {
            for(int j=0 ; j<3 ; j++)
            {
                System.out.print(rubik[i][j][0]);
            }
        System.out.println();
        }
        // System.out.println(rubik[0][0][1]);
  }
}

