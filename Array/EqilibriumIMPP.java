import java.util.Arrays;
///IMPPP
public class EqilibriumIMPP {
    public static void main(String[] args){
        int[] num={2, 3, -1, 8, 4};
        int[] prefix=new int[num.length];
        int [] sufix=new int[num.length];
        prefix[0]=0;
        sufix[num.length-1]=0;
        for(int i=1;i<num.length;i++){
            prefix[i]=num[i-1]+prefix[i-1];
        }
        for(int i=num.length-2;i>=0;i--){
            sufix[i]=sufix[i+1]+num[i+1];
        }
        for(int i=0;i<num.length;i++){
            if(sufix[i]==prefix[i]){
                System.out.println(i);
            }
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(sufix));
    }
}
