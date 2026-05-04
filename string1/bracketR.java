
public class bracketR {
    public static void main(String[] args){
        String Exp="(a+b)+c";
        String result="";
        for(int i=0;i<Exp.length();i++){
            char inter=Exp.charAt(i);
            if(inter!=')'&&inter!='('&&inter!='{'&&inter!='}'&&inter!='['&&inter!=']'){
                result=result+inter;
            }
        }
        System.out.println(result);
    }
}
