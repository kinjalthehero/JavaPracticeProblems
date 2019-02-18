/*

    Have the function LongestWord(sen) take the sen parameter
    return the largest word in the string.
    If there are two or more words that are the same length, return the first word from the string with that length.
    Ignore punctuation and assume sen will not be empty.

    Sample Test Cases

    Input:"fun&!! time"
    Output:"time"

    Input:"I love dogs"
    Output:"love"

*/

import java.util.Scanner;

public class LongestWordClass {

    public static String longestWord(String sentence) {

        // Separate each word and store it in a String array
        String[] words = sentence.split("[^A-Za-z0-9]");

        // Assume first word in the array has maximum length
        int maxIndex = 0;

        // Compare each word in the array.
        // If word size is greater then make it maxindex
        for (int i=0; i < words.length; i++) {
            if (words[i].length() > words[maxIndex].length())
                maxIndex = i;
        }

        // Return word at maxIndex
        return words[maxIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(longestWord(sc.nextLine()));
    }

}
