package Number;
public class fibonichi {
    public static void main(String[] args){
        int n=5;
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++){

            if(i==0)System.out.println(a);
            if(i==1)System.out.println(b);
            if(i>1){
                int temp=b;
                b=a+b;
                a=temp;
                System.out.println(b);
            }
        }
    }
}
