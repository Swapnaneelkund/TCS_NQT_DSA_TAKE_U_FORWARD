public class lexicographic {
    public static void main(String[] args){
        String str="abcde";
        String str1="";
        for(int i=0;i<str.length();i++){
            int asci=(int)str.charAt(i);
            if(asci==90){//"Z"
                str1=str1+(char)65;//"A"
            }else if(asci==122){//"z"
                str1=str1+(char) 97;//"a"
            }else if(asci>=65&&asci<90||asci>=97&&asci<122){
                str1=str1+(char)(asci+1);
            }
        }
        System.out.println(str1);
    }
}
