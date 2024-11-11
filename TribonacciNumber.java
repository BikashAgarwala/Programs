import java.util.Scanner;

public class TribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a position: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 1, result = 0;
        if (n == 1) result = a;
        else if (n == 2 || n == 3) result = 1;
        else {
            for (int i = 4; i <= n; i++) {
                result = a + b + c;
                a = b;
                b = c;
                c = result;
            }
        }

        System.out.println("The Tribonacci number at position " + n + " is: " + result);
    }
}

