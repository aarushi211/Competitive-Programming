import java.util.Scanner;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = in.nextInt();
        }
        int val = in.nextInt();
        System.out.println(removeElement(nums, val));
    }
    
}
