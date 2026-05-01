import java.util.Arrays;
import java.util.HashMap;
//iMPP
public class RankelementIMPP {
    public static void main(String[] args){
        int[] a={20,15,26,2,98,6};
        int[]b=a.clone();
        int[] result=new int[a.length];
        Arrays.sort(b);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<b.length;i++){
            map.put(b[i],i);
        }
        for(int i=0;i<a.length;i++){
            int c=map.get(a[i]);
            result[i]=c+1;
        }
        System.out.println(Arrays.toString(result));

    }
}
