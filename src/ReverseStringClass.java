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

    // Using String Builder
    public static String stringReverseUsingStringBuilder (String str) {

        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Using String methods");
        System.out.println(stringReverse(str));
        System.out.println("Using String Builder");
        System.out.println(stringReverseUsingStringBuilder(str));

    }
}
