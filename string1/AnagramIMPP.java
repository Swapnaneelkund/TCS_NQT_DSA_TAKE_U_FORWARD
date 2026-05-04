import java.util.Arrays;

public class AnagramIMPP {
    public static void main(String[] args){
        System.out.println(ana("abc","bac"));
    }
    public static boolean ana(String a,String b){
        String[]temp1=a.split("");
        Arrays.sort(temp1);
        a=String.join("",temp1);
        System.out.println(a);
        String[]temp2=b.split("");
        Arrays.sort(temp2);
        b=String.join("",temp2);
        System.out.println(b);
        if(a.equals(b))return true;
        return false;
    }
}
