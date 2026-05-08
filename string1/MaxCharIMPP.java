import java.util.Collection;
import java.util.HashMap;

public class MaxCharIMPP {
    public static void main(String[] args){
        String str="takeuforward";
        int val=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
                val=Math.max(map.get(str.charAt(i))+1,val);
            }else{
                map.put(str.charAt(i),1);
                val=Math.max(1,val);

            }
        }
        for (Character chr : map.keySet()) {
            if(map.get(chr)==val) System.out.println(chr);
        }
    }
}
