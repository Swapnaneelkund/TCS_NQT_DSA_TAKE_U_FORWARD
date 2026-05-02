package Number;

public class RemoveVowel {
    public static void main(String[] args){
        String str="take u forward";
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'){
               res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
