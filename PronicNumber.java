import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPronic = false;

        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) {
                isPronic = true;
                break;
            }
        }

        if (isPronic) {
            System.out.println(num + " is a Pronic Number.");
        } else {
            System.out.println(num + " is not a Pronic Number.");
        }
    }
}

