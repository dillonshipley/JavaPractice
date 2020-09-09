/**
 * String[] args
 * args is a string array that stores incoming arguments from the command line
 */
/**
 * running java files
 * javac filename.extension to compile
 * java filename to run
 */

/**
 * command line arguments
 * having 2 strings for command line args is helpful- one for input file, one for output file
 */

public class CmdLine {
    public static void main (String[] args){
        System.out.println(args.length);
        if(args.length == 3) {
            String word = args[0];
            int dill = Integer.parseInt(args[1]);
            double dill2 = Double.parseDouble(args[2]);
            System.out.println(word + " " + dill + " " + dill2);
        }
    }
}
