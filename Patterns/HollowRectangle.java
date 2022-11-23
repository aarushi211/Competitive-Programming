// *****
// *   *
// *   *
// *****

import java.util.*;
class HollowRectangle{
    public static void main(String args[]){
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        m = sc.nextInt();
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=m; j++){
                if(i == 0 || j == 0 || i == n || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}