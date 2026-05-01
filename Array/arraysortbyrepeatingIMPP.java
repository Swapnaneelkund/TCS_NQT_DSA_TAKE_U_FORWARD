import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class arraysortbyrepeatingIMPP {
    public static void main(String[] args){
        int[] a={1,2,3,2,4,3,1,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        ArrayList<Integer>list=new ArrayList<>(map.keySet());
        Collections.sort(list,(x,y)->map.get(y)-map.get(x));
        System.out.println(list);
        ArrayList<Integer> result=new ArrayList<>();
        for (Integer z : list) {
            for(int i=1;i<=map.get(z);i++){
                result.add(z);
            }
        }
        System.out.println(result);
    }
}
