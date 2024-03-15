
package guessing;

import java.util.Scanner;
import java.util.stream.IntStream;

/*5.4*/
public class Guessing {

    public static void main(String[] args) {
        int[] num = {20, 15, 80, 16, 32, 7, 4, 100, 20, 10};
        int sum = IntStream.of(num).sum();
        System.out.println("Sum of numbers is: " + sum);

        int sums = 0;
        for (int i = 0; i < num.length; i++) {
            sums += num[i];
        }
        System.out.println("Sums is: " + sums);

        long product = 1;
        for (int i = 0; i < num.length; i++) {
            product *= num[i];
        }
        System.out.println("Product is: " + product);

        findMaxMin(num);
    }

    // max - min
    public static void findMaxMin(int[] num) {
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
        
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if ( num[i] > 30) { count++; }     
            }
        System.out.println("There are " +count+ " number that are more then 30.");
        }
        
    }

