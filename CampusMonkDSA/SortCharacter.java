import java.util.ArrayList;
import java.util.HashMap;

public class SortCharacter {
    public static void main(String[] args) {
        String str="tree";
        String res="";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        ArrayList<Character>list=new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        for(char ch:list){
            int temp=map.get(ch);
            for(int i=1;i<=temp;i++){
              res=res+ch;
            }
        }
        System.out.println(res);

    }
}
