import java.util.ArrayList;
import java.util.HashMap;

public class showDuplicate_unsortedIMPP {
    public static void main(String[] args){
        int[] arr={1,5,1,7,2,6,6,2,3,3,4};
        HashMap<Integer,Integer> hash=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i])+1);
            }else{
                hash.put(arr[i],1);
            }
        }

         hash.forEach((key,value)->{
             if (value>1){
                result.add(key);
             }
         });
         System.out.println(result);
        

    }
}
