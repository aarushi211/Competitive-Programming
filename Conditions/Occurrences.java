import java.util.Scanner;

public class Occurrences {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String a = in.next();
        char[] ch = a.toCharArray();
        char n = in.next().trim().charAt(0);
        int count = 0;
        for(int i = 0; i<a.length(); i++){
            if(n == (ch[i])){
                count++;
            }
        }

        // int n = in.nextInt();
        // while(n>0){
        //     int rem = n%10;
        //     if(rem == a){
        //         count++;
        //     }
        //     n = n/10;
        // }
        System.out.println("Occurrences: "+count);
    }
}
