import java.util.Scanner;

import static java.lang.System.*;;

/*
 * Program to calculate sum and average for non-negative integers
 *
 * See:
 * - ex3arraysfor
 * - IW5LoopAndAHalf in particular.
 */
public class Ex3SumAvg {

    public static void main(String[] args) {
        new Ex3SumAvg().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // Write your code here
        double sum = 0;
        double[] numberArray = new double[5];
        out.println("Input 5 numbers (enter after each) > ");
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = sc.nextDouble();
        }
        // -- Input (and bookkeeping)
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        double average = sum/(numberArray.length);

        // -- Process---


        // -- Output ----
        out.println("Sum = " + sum + "  Average = " + average);
    }

}
