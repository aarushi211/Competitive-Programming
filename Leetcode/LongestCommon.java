import java.util.Arrays;
import java.util.Scanner;

public class LongestCommon {
    public static String Prefix(String[] s){
        int len = s.length;
        if(len == 0)
            return "";
        else if(len == 1)
            return s[0];
        
        Arrays.sort(s);

        int end = Math.min(s[0].length(), s[len-1].length());
        int i = 0;
        while(i<end && s[0].charAt(i) == s[len-1].charAt(i))
            i++;

            String common = s[0].substring(0, i); 
            return common;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        for(int i = 0; i<n; i++){
            s[i] = in.next();
        }
        System.out.println(Prefix(s));
    }
    
}
