
public class REmoveSpecislCharacter {
    public static void main(String[] args){
        String str="hbjsdbjgf%";
        String res="";
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)<='Z' && str.charAt(i)>='A')){
                res=res+str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
