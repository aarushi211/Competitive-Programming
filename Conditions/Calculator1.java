import java.util.Scanner;

public class Calculator1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/'|| op == '%'){
                int a = in.nextInt();
                int b = in.nextInt();

                if(op == '+'){
                    ans = a+b;
                }
                if(op == '-'){
                    ans = a-b;
                }
                if(op == '*'){
                    ans = a*b;
                }
                if(op == '/'){
                    ans = a/b;
                }
                if(op == '%'){
                    ans = a%b;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }
            System.out.println(ans);
        }
    }
}