import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num==0) {
            System.out.println(num + " is not a Bouncy Number.");
            return;
        }
        boolean increasing = false, decreasing = false;
        int lastDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int currentDigit = num % 10;

            if (currentDigit < lastDigit) increasing = true;
            if (currentDigit > lastDigit) decreasing = true;

            lastDigit = currentDigit;
            num /= 10;
        }

        if (increasing && decreasing) {
            System.out.println("It is a Bouncy Number.");
        } else {
            System.out.println("It is not a Bouncy Number.");
        }
    }
}

