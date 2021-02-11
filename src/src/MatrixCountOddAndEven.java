public class MatrixCountOddAndEven {
    public static void main(String[] args){
        int row,col,countOdd=0,countEven=0;
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        row=a.length;
        col=a[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]%2==0){
                    countEven++;

                }
                else{
                    countOdd++;
                }
            }
        }
        System.out.println("frequency of even numbers :"+countEven);
        System.out.println("frequency of odd numbers :"+countOdd);

    }
}
