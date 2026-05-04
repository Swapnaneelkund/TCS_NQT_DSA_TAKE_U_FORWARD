import java.util.HashMap;

public class FrequencyIMPP {
    public static void main(String[] args){
        String str="takeuforward";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        map.forEach((key,value)->{
            System.out.print(key+""+value+"");    //if Java sees char + int, it does arithmetic
                                                  // if Java sees a String first, it does concatenation
        });
    }
}
