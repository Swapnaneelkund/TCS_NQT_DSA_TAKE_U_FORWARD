public class SumOfNumberInString {
    public static void main(String[] args){
        String temp="";
        String str="ab123kc25";
        int sum=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)<='Z'&&str.charAt(i)>='A') || (str.charAt(i)<='z'&&str.charAt(i)>='a')){
                if(temp.length()!=0){
                    sum=sum+Integer.parseInt(temp);
                    temp="";
                }
            }else{
                temp=temp+str.charAt(i);
            }
        }
        if(temp.length()!=0){
            sum=sum+Integer.parseInt(temp);

        }
        System.out.println(sum);
    }
}
