import java.util.Scanner;

public class Largest{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //********************************Method 1**********************************************/
        // if(a>b){
        //     if(a>c){
        //         System.out.println(a);
        //     }
        //     else{
        //         System.out.println(c);
        //     }
        // }else{
        //     if(b>c){
        //         System.out.println(b);
        //     }else{
        //         System.out.println(c);
        //     }
        // }

        //********************************Method 2**********************************************/

        // int max = a;
        // if(max<b){
        //     max = b;
        // }
        // if(max<c){
        //     max = c;
        // }
        // System.out.println("Largest number is "+max);

        //********************************Method 3**********************************************/

        int max = Math.max(a, (Math.max(b, c)));
        System.out.print("Largest Number is "+max);
    }
}