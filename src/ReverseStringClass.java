/*
    Reverse a String

 */
import java.util.Scanner;

public class ReverseStringClass {

    public static String stringReverse (String str) {

        String revString = "";

        if(str == null || str.isEmpty()){
            return str;
        }

        for (int i = str.length()-1; i >= 0; i--) {
            revString = revString + str.charAt(i);
        }

        return revString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(stringReverse(sc.nextLine()));
    }
}
