import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ValidParenthesis {
    public static boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
 
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
 
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }

        return (stack.isEmpty());
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(isValid(s));
    }
    
}



   