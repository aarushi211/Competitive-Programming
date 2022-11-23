import java.util.*;

//public class Palindrome {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        String revStr = "";
//        int n = str.length();
//        for (int i = n - 1; i >= 0; i--) {
//            revStr += str.charAt(i);
//        }
//        if (str.toLowerCase().equals(revStr.toLowerCase())) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//
//    }
//}

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int originalNum = n;
        int revNum = 0;
        while(n!=0){
            int remainder = n%10;
            revNum = revNum*10 + remainder;
            n = n/10;
        }
        if(Integer.signum(originalNum) == -1){
            System.out.println("False");
        }
        else if(revNum == originalNum){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}