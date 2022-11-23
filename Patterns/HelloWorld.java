import java.util.Scanner;

class HelloWorld {
    public static void main(String args[]){
        int marks;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                marks = sc.nextInt();
                if(marks >= 90){
            System.out.println("This is good");
        }
        else if(marks >=60){
            System.out.println("This is also good");
        }
        else{
            System.out.println("This is good as well");
        }
                break;
            
            case 0:
                break;
            
        }
        
    }
}