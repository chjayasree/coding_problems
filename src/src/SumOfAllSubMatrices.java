public class SumOfAllSubMatrices {
    public static void main(String args[]){
        int arr[][]={{3,7},{6,5}};

        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int top_left=(i+1)*(j+1);
                int bottom_right=(n-i)*(n-j);
                sum+=top_left*bottom_right*arr[i][j];
            }
        }
        System.out.println(sum+" ");
    }
}
