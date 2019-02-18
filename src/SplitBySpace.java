/*
    Split the words in it by whitespace.
    https://javatutorial.net/basic-java-regular-expressions

    Input
        String: “Hello, it’s me”
    Output
        Hello,
        it's
        me
 */

import java.util.Scanner;

public class SplitBySpace {

    public static void splitStringBySpace (String input) {

        String[] output = input.split(" ");
        for (String finalOutput: output)
            System.out.println(finalOutput);
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        splitStringBySpace("My name is Lakhan!");
    }

}
