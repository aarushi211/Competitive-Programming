class duplicates{
    public static void main(String args[]){
        int i = 0;
        int dividend = -2147483648;
        int divisor = -1;
        int org_dividend = dividend;
        int abs_dividend = Math.abs(dividend);
        if(divisor == 0){
            System.out.println(-1);
        }else if(Math.abs(divisor) == 1){
            System.out.println(org_dividend);
        }else if(abs_dividend == 0){
            System.out.println(0);
        }else{
            while(abs_dividend>0){
                abs_dividend -= Math.abs(divisor);
                i++;
            }
            if(divisor<0 || org_dividend<0){
                if(divisor<0 && org_dividend<0){
                    System.out.println(i-1);
                }else{
                    System.out.println((i-1)*(-1));
                }
                
            }else{
                System.out.println(i-1);
            }
        }
        
    }
}