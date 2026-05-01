import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args){
        int[] arr={1,2,2,2,3,3};
        int j=0;
        for(int i=1;i<arr.length;i++){
           if(arr[j]!=arr[i]){
            arr[++j]=arr[i];
           }
        }
      int length=j+1;
      int[] arr1= new int[length];
        for(int i=0;i<length;i++){
            arr1[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));

    }
}
