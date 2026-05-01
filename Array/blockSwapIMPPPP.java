import java.util.Arrays;

public class blockSwapIMPPPP {
    public static void main(String[] args){
        int[] arr= {1, 2, 3, 4, 5};
        int k=2;
        swap(0,arr.length-1,arr);
        swap(0,arr.length-k-1,arr);
        swap(arr.length-k,arr.length-1,arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int left,int right,int[] arr){
        while(left<right){
            int temp= arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
