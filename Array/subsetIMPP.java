import java.util.HashMap;

public class subsetIMPP {
    public static void main(String[] args){
        int arr1[]= {1,3,4,5,2};
       int arr2[]= {2,4,3,1,7,5,15};
       boolean result=subset(arr1, arr2);
       System.out.println(result);
       
    }
    public static boolean subset(int[]arr1,int[] arr2){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                map.put(arr2[i],map.get(arr2[i])+1);
            }else{
                map.put(arr2[i],1);
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i]))return false;
        }
        return true;
    }
}
