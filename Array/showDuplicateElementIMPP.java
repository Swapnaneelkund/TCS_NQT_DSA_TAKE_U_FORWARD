import java.util.*;
public class showDuplicateElementIMPP {
    public static void main(String[] args){
        int[] arr={1,1,2,2,2,3,3,4};
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                arr1.add(arr[i]);
            }
        }
        System.out.println(arr1);

    }
}
