import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num==0) {
            System.out.println(num + " is not a Niven Number.");
            return;
        }
        int sumOfDigits = 0, temp = num;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (num % sumOfDigits == 0) {
            System.out.println(num + " is a Niven Number.");
        } else {
            System.out.println(num + " is not a Niven Number.");
        }
    }
}

