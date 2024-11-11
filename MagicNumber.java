import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num > 9) {
            num = sumOfDigits(num);
        }

        if (num == 1) {
            System.out.println("It is a Magic Number.");
        } else {
            System.out.println("It is not a Magic Number.");
        }
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
