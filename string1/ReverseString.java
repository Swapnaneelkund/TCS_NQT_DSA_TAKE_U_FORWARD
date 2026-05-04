public class ReverseString{
    public static void main(String[] args){
        String str="i am iron man";
        String Result="";
        for(int i=str.length()-1;i>=0;i--){
           Result+= str.charAt(i);
        }
        System.out.println(Result);
    }
}