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

/**
 * every class must have a main
 */
//single line comments


public class Basics {
    //all public types must be in own file
    public static void main(String[] args) {
        //static things can be executed without creating an object of class Basics
        //static means no "this" reference, cannot refer to class
        //String[] is bracket for args, args stores command line arguments of type string array

        System.out.println(args);
    }

}
