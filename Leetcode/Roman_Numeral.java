import java.util.HashMap;
import java.util.Scanner;

public class Roman_Numeral{
    public static int roman_to_integer(String s){
        if(s.length() == 0 || s == null)
            return -1;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length(), ans = map.get(s.charAt(len-1));

        for(int i = len-2; i>=0; i--){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                ans += map.get(s.charAt(i));
            else
                ans -= map.get(s.charAt(i));
        }
        return ans;

    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(roman_to_integer(s));
    }
}