import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // System.out.println(isArmstrong(n));
        allArmstrong();
    }

    static boolean isArmstrong(int n){
        int sum = 0;
        int num = n;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum = sum + (int)Math.pow(rem, 3);
        }
        if(sum == num){
            return true;
        }
        return false;
    }

    static void allArmstrong(){
        for(int i = 100; i<=999; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
}
