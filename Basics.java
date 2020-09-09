/**
 * javadoc comment!
 */
/**
 * access modifiers
 * public are accesible anywhere
 * package private is accessible anywhere in the package
 * protected are accessible from other subclasses, even if not in package
 * private types are only accessible from the class
 */
/** primitive java types
 * char: single-character, char _ = '_'
 * int
 * double
 * float
 * bool
 * short
 * long
 * byte
 */
/**
 * strings
 * strings are nonprimitive, part of a class
 * Can use stuff like length, equals(), compareTo(), trim(), split(), toCharArray(), charAt();
 */
/**
 * cases
 * constants use MACRO_CASE
 * classes use PascalCase
 * identifiers use camelCase
 */
/** static objects
 * static things can be executed without creating an object of class Basics
 * static means no "this" reference, cannot refer to class. no matter how many objects, only 1 static object
 * String[] is bracket for args, args stores command line arguments of type string array
 */
/**
 * loops
 * for, while, do-while
 */

import java.text.DecimalFormat;

/**
 * every class must have a main
 */
//single line comments

import java.text.DecimalFormat;
import java.util.Arrays;

public class Basics {

    static final int NUM_FRIENDS = 4;

    //all public types must be in own file
    public static void main(String[] args) {

        System.out.println(args);
        char myChar = 'a';
        //the Math class is in the java.lang package which is imported for free
        //DecimalFormat is not- check imports at top.
        double myDouble = Math.PI;
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println(df.format(myDouble));

        String myString = "hello";
        System.out.println("myString : " + myString);
        int[] myInts = {1, 2, 3, 4};
        String[] myFriends = new String[NUM_FRIENDS];
        myFriends[0] = "p";
        myFriends[1] = "r";
        myFriends[2] = "m";
        myFriends[3] = "j";

        System.out.println(Arrays.toString(myFriends));
        System.out.println(myFriends.length);
        System.out.println(myFriends[myFriends.length - 1]);

        int x = 5;
        if (x < 5) {
            System.out.println("x < 5");
        } else if (x > 5) {
            System.out.println("x > 5");
        } else {
            System.out.println("x is 5");
        }

        for(int i = 1; i <= 10; i++)
        {
            System.out.print((i * 2) + ", ");
        }
        System.out.println();

        int i = 1;
        while(i <= 10) {
            System.out.print((i * 2) + ", ");
            i++;
        }
        System.out.println();

        i = 2;
        do {
            System.out.print(i + ", ");
            i = i + 2;
        }while(i <= 20);
        System.out.println();
    }
}
