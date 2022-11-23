import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int length = String.valueOf(n).length();
        // int a;
        // for(int i = 0; i<length; i++){ 
        //     a = n%10;
        //     n = n/10;
        //     System.out.print(a);
        // }
        // System.out.print("\n");

        int ans = 0;
        while(n>0){
            int rem = n%10;
            n/=10;
            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}
