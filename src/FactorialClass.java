import java.util.Scanner;

public class FactorialClass {

    public static int factorial (int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }

}
