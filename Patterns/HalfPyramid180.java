//      *
//     **
//    ***
//   ****

import java.util.*;
public class HalfPyramid180 {
    public static void main(String arg[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
