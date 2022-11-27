import java.util.Scanner;

public class FirstOccurrence {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String haystack = in.next();
        String needle = in.next();
        System.out.println(strStr(haystack, needle));
    }
}
