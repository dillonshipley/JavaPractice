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
 * Strings are nonprimitive, part of a class
 * Can use stuff like length, equals(), compareTo(), trim(), split(), toCharArray(), charAt();
 */

import java.text.DecimalFormat;

/**
 * every class must have a main
 */
//single line comments

import java.text.DecimalFormat;
public class Basics {
    //all public types must be in own file
    public static void main(String[] args) {
        //static things can be executed without creating an object of class Basics
        //static means no "this" reference, cannot refer to class
        //String[] is bracket for args, args stores command line arguments of type string array

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
    }
}
