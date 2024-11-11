import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which contain even number of digits: ");
        int num=sc.nextInt();
        sc.close();
        techNumber(num);
    }

    static void techNumber(int n){
        String nStr = Integer.toString(n);

        if (nStr.length() % 2 != 0) {
            System.out.println(n + " is not a Tech Number (it must have an even number of digits).");
            return;
        }

        int middle = nStr.length() / 2;
        int firstHalf = Integer.parseInt(nStr.substring(0, middle));
        int secondHalf = Integer.parseInt(nStr.substring(middle));
        int sum = firstHalf + secondHalf;

        if (sum * sum == n) {
            System.out.println("It is a Tech Number.");
        } else {
            System.out.println("It is not a Tech Number.");
        }
        
    }

}
