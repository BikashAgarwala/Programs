import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String num=sc.nextLine();
        sc.close();
        if(duckNumber(num)==true){
            System.out.println("It is a Duck Number.");
        }else{
            System.out.println("It is not a Duck Number.");
        }
    }

    static boolean duckNumber(String s){
        if(s.charAt(0)=='0'){
            return false;
        }
        char[] ch= s.toCharArray();
        for(int i=1;i<ch.length;i++){
            if(ch[i]=='0'){
                return true;
            }
        }
        return false;
    }
}
