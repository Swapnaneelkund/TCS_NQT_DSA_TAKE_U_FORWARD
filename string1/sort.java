import java.util.Arrays;

public class sort {
    public static void main(String[] args){
        String str="zxcbg";
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String result=new String(ch);
        System.out.println(result);
    }
}
