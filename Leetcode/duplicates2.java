import java.util.Scanner;

public class duplicates2 {
    static int divide(long dividend, int divisor){
        int sign = (dividend<0 ^ divisor<0 ? -1: 1);
        long abs_dividend = Math.abs(dividend);
        int abs_divisor = Math.abs(divisor);
        int ans = 0;
        if(abs_divisor == 1){
            ans = (int)abs_dividend;
        }else{
            while(abs_dividend>=abs_divisor){
                abs_dividend -= abs_divisor;
                ans++;
            }
        }
        
        if(sign == -1){
            ans = -ans;
        }
        return ans;
    }

    static long divide2(long dividend, long divisor){
        long sign = (dividend<0 ^ divisor<0 ? -1: 1);
        long abs_dividend = Math.abs(dividend);
        long abs_divisor = Math.abs(divisor);
        long ans = 0, temp = 0;
        if(abs_divisor == 1){
            ans = abs_dividend;
        }
        else{
            for(int i = 31; i>=0; i--){
                if(temp+(divisor<<i)<=dividend){
                    temp += divisor << i;
                    ans |= 1L << i;
                }
            }
        }
        if(ans>(Math.pow(2, 31)-1) && sign != -1)
            ans = (long)(Math.pow(2, 31)-1);
        if (sign == -1)
            ans = -ans;
 
        return ans;
    }

    static int divide3(long dividend, long divisor) {
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
 
       
        long abs_dividend = Math.abs(dividend);
        long abs_divisor = Math.abs(divisor);
 
        long quotient = 0;
        if(abs_divisor == 1){
            quotient = abs_dividend;
        }else{
            while (abs_dividend >= abs_divisor) {
                abs_dividend -= abs_divisor;
            ++quotient;
            }
        }
        
        if(quotient>(Math.pow(2, 31)-1) && sign != -1)
            quotient = (long)(Math.pow(2, 31)-1);
        if (sign == -1)
            quotient = -quotient;
 
        return (int)quotient;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Long dividend = in.nextLong();
        long divisor = in.nextLong();
        System.out.println(divide2(dividend, divisor));
    }
}
