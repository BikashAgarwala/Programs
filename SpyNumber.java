import java.util.*;
public class SpyNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        sc.close();
        if(spyNumber(num)==true){
            System.out.println("It is a Spy Number.");
        }else{
            System.out.println("It is not a Spy Number.");
        }
    }
    
    static boolean spyNumber(int n){
        if(n==0){
            return false;
        }
        int sum=0;
        int product=1;
        while(n>0){
            int rem=n%10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        if(sum==product){
            return true;
        }
        return false;
    }
}