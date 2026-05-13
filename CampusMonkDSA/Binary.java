public class Binary {
    public static void main(String[] args){
        int[] num={-1,0,3,5,9,12};
        int left=0;
        int right=num.length-1;
        int target=9;
        while(left<right){
            int mid=(left+right)/2;
            if(num[mid]==target){
                System.out.println(mid);
                break;
            }else if(num[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
    }
}
