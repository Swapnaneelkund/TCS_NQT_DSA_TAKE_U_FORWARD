public class Palidrome{
    public static void main(String[] args){
       String Str =  "ABCDCBA";
       System.out.println(palidromeCheck(Str));
    }
    public static boolean palidromeCheck(String Str){
        for(int i=0;i<Str.length()/2;i++){
           if(Str.charAt(i)!=Str.charAt(Str.length()-1-i)){
            return false;
        }
       }
       return true;
    }
}