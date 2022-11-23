import java.util.Scanner;

public class LastWord {
    public static int length(String s){
        s = s.strip();
        int n = s.lastIndexOf(' ');
        int size = s.length();
        String sub = s.substring(n+1, size);
        return sub.length();
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(length(s));
    }
    
}
