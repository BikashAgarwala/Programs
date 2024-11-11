import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        if (sumOfDigits == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is not a Neon Number.");
        }
    }
}

