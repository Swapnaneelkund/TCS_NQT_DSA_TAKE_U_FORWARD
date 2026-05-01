public class AvgElement {
    public static void main(String[] args){
     int[] arr={1,2,3,4,5};
     float ans=avg(arr);
     System.out.println(ans);
    }
    public static float avg(int[] arr){
        int sum=0;
        for (int element :arr) {
            sum+=element;
        }
        return sum/(float) arr.length;
    }
}
