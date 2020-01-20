import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Using class objects to represent heroes
 *  https://en.wikipedia.org/wiki/Gladiators_(1992_UK_TV_series)
 *
 * See:
 * - ex5classes
 */
public class Ex6ClassObjects {

    public static void main(String[] args) {
        new Ex6ClassObjects().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // -------- Input ------------
        out.print("What's the name of the hero 1? ");
        String hero1_name = sc.nextLine();
        out.print("How strong is "+hero1_name+"?");
        int hero1_strength = sc.nextInt();
        sc.nextLine();

        out.print("What's the name of the hero 2? ");
        String hero2_name = sc.nextLine();
        out.print("How strong is "+hero2_name+"?");
        int hero2_strength = sc.nextInt();

        Hero hero1 = new Hero();
        hero1.name = hero1_name;
        hero1.strength = hero1_strength;

        Hero hero2 = new Hero();
        hero2.name = hero2_name;
        hero2.strength = hero2_strength;
        // ------- Output --------------
        if(hero1.strength > hero2.strength) {
            out.print("hero " + hero1.name + "is stronger");
        }
        else if(hero2.strength > hero1.strength){
            out.print("hero " + hero2.name + " is stronger");
        }
        else {
            out.print("They are equally strong");
        }
    }

    // ------ The class to use  -----------
    // A class for objects that describes a Hero
    class Hero {
        String name;
        int strength;
    }


}
