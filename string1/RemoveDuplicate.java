import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args){
        System.out.println("enter String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        LinkedHashSet<Character>set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(char ele:set){
           System.out.print(ele);
        }
    }
}
