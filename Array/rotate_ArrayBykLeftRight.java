import java.util.Arrays;

public class rotate_ArrayBykLeftRight {
    public static void main(String[] args){
       int[] a={1, 2, 3, 4, 5, 6, 7};
       int k=2;
       String Direction="right";
       rotate(Direction, a, k);
       System.out.println(Arrays.toString(a));
    }
    public static void rotate(String Direction,int[] arr,int k ){
        k=k%arr.length;
        if(Direction=="right"){
            swap(arr,0,arr.length-1);
            swap(arr,0,k-1);
            swap(arr,k,arr.length-1);
        }else{
            swap(arr,0,arr.length-1);
            swap(arr,0,arr.length-k-1);
            swap(arr,arr.length-k,arr.length-1);
        }
    }
    public static void swap(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
