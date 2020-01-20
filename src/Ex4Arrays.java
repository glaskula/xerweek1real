import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Program to exercise arrays
 *
 * See:
 * - ex3arraysfor
 */
public class Ex4Arrays {

    public static void main(String[] args) {
        new Ex4Arrays().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        int[] arr = {0, 0, 0, 0, 0};  // or new int[5]

        out.print("Input 5 integers (space between, then enter) > ");
        // Write your code here
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        out.println("The array is: ["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+"]");
        out.print("Input a value to find > ");
        int x = sc.nextInt();
        int found = 0;
        for(int i = 0;i < arr.length;i++){
            if (arr[i] == x) {
                out.print("value "+x+"is found at index"+i);
                found = 1;
            }
        }
        if(found == 0){
            out.print("value"+x+"was not found");
        }
    }
}
