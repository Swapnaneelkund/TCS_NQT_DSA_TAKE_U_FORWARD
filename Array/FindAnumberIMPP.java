public class FindAnumberIMPP {
    public static void main(String[] args){
        int[] number={1,2,3,4,5};
        int k=2;
        int data=FindIndex(number, k);
        System.out.println(data);
    }
    public static int FindIndex(int[] arr,int k){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
