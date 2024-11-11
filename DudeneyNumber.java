import java.util.Scanner;

public class DudeneyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sumOfDigits = 0, temp = num;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (sumOfDigits * sumOfDigits * sumOfDigits == num) {
            System.out.println(num + " is a Dudeney Number.");
        } else {
            System.out.println(num + " is not a Dudeney Number.");
        }
    }
}
