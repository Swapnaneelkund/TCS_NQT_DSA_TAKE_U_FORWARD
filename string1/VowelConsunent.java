
public class VowelConsunent {
    public static void main(String[] args){
        String  str="India won the cricket match";
        str=str.toLowerCase();
        int vowel=0;
        int consunent=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
               vowel++;
            }else{
                consunent++;
            }
        }
        System.out.println(vowel+" "+consunent);
    }
}
