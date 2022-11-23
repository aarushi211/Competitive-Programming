import java.util.Scanner;

public class InsertPosition {
    public static int search(int[] nums, int target){
        int n = nums.length;
        int value = binarySearch(nums, 0, n, target);
        if(value == -1){
            for(int i = 0; i<n; i++){
                if(target<nums[i] && i!=n-1){
                    value = i;
                    break;
                }else if(i == n-1)
                    value = n;
            }
        }
        return value;
    }

    public static int binarySearch(int[] nums, int l, int r, int x){
        if(r>=l){
            int mid = l+(r-1)/2;
            if(nums[mid] == x)
                return mid;
            if(nums[mid]>x)
                return binarySearch(nums, l, mid-1, x);
            else    
                return binarySearch(nums, mid+1, r, x);
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Target:");
        int target = in.nextInt();
        System.out.println(search(nums, target));
    }
}
    

