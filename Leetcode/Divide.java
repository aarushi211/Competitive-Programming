import java.util.Scanner;

public class Divide {
    public static int divide(long dividend, long divisor) {
        long sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
 
        // Update both divisor and
        // dividend positive
        long abs_dividend = Math.abs(dividend);
        long abs_divisor = Math.abs(divisor);
 
        // Initialize the quotient
        long quotient = 0;
        if(abs_divisor == 1){
            quotient = abs_dividend;
        }else{
            while (abs_dividend >= abs_divisor) {
            abs_dividend -= abs_divisor;
            ++quotient;
            }
        }
        
        // if the sign value computed earlier is -1 then
        // negate the value of quotient
        if(quotient>(Math.pow(2, 31)-1) && sign != -1)
            quotient = (long)(Math.pow(2, 31)-1);
        if (sign == -1)
            quotient = -quotient;
        
        return (int)quotient;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int dividend = in.nextInt();
        int divisor = in.nextInt();
        System.out.println(divide(dividend, divisor));
    }
}
