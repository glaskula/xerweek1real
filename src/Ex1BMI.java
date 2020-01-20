import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *
 * Program to calculate a persons BMI
 * See https://en.wikipedia.org/wiki/Body_mass_index
 *
 * Formula is: bmi = weight / height²     (kg/m²)
 *
 * See:
 * - ex1basics
 * - B6Slope in particular.
 */
public class Ex1BMI {

    // Don't care about this, must be there, start coding at program
    public static void main(String[] args) {
        new Ex1BMI().program();
    }

    // This connects our program to the keyboard
    final Scanner sc = new Scanner(in);

    void program() {
        // Write your code here
        out.println("BMI Calculator");
        // --- Input ---------
        out.print("Enter weight: ");
        double weight = sc.nextDouble();
        out.print("Enter Height: ");
        double height = sc.nextDouble();
        // --- Process --------
        double BMI = weight/(height*height);
        // --- Output ---------
        out.println("BMI = " + BMI);
    }
//dsadas
}
