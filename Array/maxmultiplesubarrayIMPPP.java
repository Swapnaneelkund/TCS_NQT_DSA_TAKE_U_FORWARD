import java.util.Arrays;
//very very IMMP
public class maxmultiplesubarrayIMPPP {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,0};
        int multiple=1;
        int result=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            multiple=multiple*nums[i];
           result= Math.max(result, multiple);
            if(multiple==0){
               multiple=1;
            }
        }
        multiple=1;
        for(int i=nums.length-1;i>=0;i--){
            multiple=multiple*nums[i];
           result= Math.max(result, multiple);
            if(multiple==0){
               multiple=1;
            }
        }
        System.out.println(result);
    }
}
//we dont need to do both left right in max subarray sum as like int[] nums = {-1, -2, -3};...here - is unpredictable let max 2 and right is 6