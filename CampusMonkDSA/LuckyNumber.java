//day19
public class LuckyNumber {
    public static void main(String[] args){
        int[][] arr={{3,7,8},{9,11,13},{15,16,17}};
        int maxCol=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int rowMin=Integer.MAX_VALUE;
            for(int j=0;j<arr[i].length;j++){
               rowMin=Math.min(rowMin,arr[i][j]);
            }
            maxCol=Math.max(maxCol,rowMin);
        }
        if(maxCol>Integer.MIN_VALUE){
            System.out.println(maxCol);
        }else{
            System.out.println(-1);
        }
        
    }
}
