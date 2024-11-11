import java.util.Scanner;

public class HarshadMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (num % sum == 0) {
            while (sum > 9) {
                sum = sumOfDigits(sum);
            }

            if (sum == 1) {
                System.out.println(num + " is a Harshad Magic Number.");
            } else {
                System.out.println(num + " is a Harshad Number but not a Magic Number.");
            }
        } else {
            System.out.println(num + " is not a Harshad Number.");
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


