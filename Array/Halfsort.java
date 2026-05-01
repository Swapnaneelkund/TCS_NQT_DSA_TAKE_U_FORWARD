import java.util.Arrays;
public class Halfsort{
    public static void main(String[] args){
        int[] arr={8,7,1,6,5,9};
        Arrays.sort(arr);
        int a=arr.length/2;
        int j=arr.length-1;
        for(int i=a;i<arr.length;i++){
            swap(i,j,arr);
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}