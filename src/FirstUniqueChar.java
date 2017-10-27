/**This program finds the first unique character in a user-defined string
 *
 * by Curtis Hohl
 * 10/27/17
 */

import java.util.Scanner;
import java.util.HashMap;

public class FirstUniqueChar {

    public static void main(String[] args) {
        //prompt user for input
        System.out.println("Program will find first unique character. Please type input: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        //print found char
        char uC = findFirstUniqueChar(s);
        System.out.println("The first unique character is " + uC);
    }

    public static Character findFirstUniqueChar(String s) {
        //build hashmap
        HashMap<Character, Integer> charHashM =
                new HashMap<Character, Integer>();

        Character c;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            c = s.charAt(i);
            if (charHashM.containsKey(c))
                charHashM.put(c, charHashM.get(c) + 1);

            else charHashM.put(c, 1);
        }
        //return char if only one instance is found in the HashMap
        for (int i = 0; i < l; i++) {
            c = s.charAt(i);
            if (charHashM.get(c) == 1)
                return c;

        }
        //if # found !1, give error
        System.out.println("This input does not have any unique characters.");
        return null;
    }
}
