import java.util.Arrays;

public class twosum {
    public static void main(String[] args){
        int[] num={2,5,7,11};
        int target=18;
        int left=0;
        int right=num.length-1;
        while(left<right){
            int sum=num[left]+num[right];
            if(sum==target){
                System.out.println(Arrays.toString(new int[]{left,right}));
                break;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }

            
        }
    }
}
