import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrome(int n) {
        int originalNum = n;
        int revNum = 0;
        while(n!=0){
            int remainder = n%10;
            revNum = revNum*10 + remainder;
            n = n/10;
        }
        if(Integer.signum(originalNum) == -1){
            return false;
        }
        else if(revNum == originalNum){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPalindrome(n));
    }
}
