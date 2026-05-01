import java.util.*;
public class MedianIMPP {

    public static void main(String[] args){
        int[]arr={2,4,1,3,5,6};
        Arrays.sort(arr);
        if(arr.length%2!=0){
           System.out.println(arr[arr.length/2]);
        }else{
            float decimal=(arr[arr.length/2]+arr[arr.length/2-1])/2f;
            System.out.println(decimal);
        }
    }
}
