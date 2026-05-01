import java.util.Arrays;
//very very very imppppp//

public class shift0IMPP {
    public static void main(String[] args){
        int[] arr={1,2,4,0,0,5,0,7};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
