import java.util.HashMap;

public class freqency{
    public static void main(String[] args){
        int[] arr = {10,5,10,15,10,5};
        HashMap<Integer,Integer> map1=freqency1(arr);
        System.out.println(map1);

    }
    public static HashMap<Integer,Integer> freqency1(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
           
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                
            }else{
                map.put(arr[i],1);
            }
        }
        return map;
    }
}