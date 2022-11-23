import java.util.Objects;
import java.util.Scanner;

public class regular_exp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String p = in.next();
        int n1 = s.length();
        int n2 = p.length();
        String ans = "";
        if(p.charAt(0) == '.'){
            if(n1 == 1 && n2 == 1){
                ans = "True";
            } else if (Objects.equals(p, ".*")) {
                ans = "True";
            }
        } else if(p.charAt(n2-1) == '*'){
            String new_p = p.substring(0, n2-1);
            if(s.equals(new_p)){
                ans = "True";
            }else{
                for(int i = 0; i<n1; i++){
                    new_p = new_p+new_p;
                    System.out.println(new_p);
                    if(s.equals(new_p)){
                        ans = "True";
                        break;
                    }else{
                        ans = "False";
                    }
                }
            }
        } else if (p.equals(s)) {
            ans = "True";
        }else {
            ans = "False";
        }
        System.out.println(ans);
    }
}
