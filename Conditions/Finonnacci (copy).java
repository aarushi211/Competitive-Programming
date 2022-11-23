import java.util.Scanner;

public class Finonnacci {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 2;
        int a = 0;
        int b = 1;
        while(i<=n){
            int temp = a;
            a = a+b;
            b = temp;
            i++;
            
        }
        System.out.println(n+"th number is "+a);
   
    }

   
}

