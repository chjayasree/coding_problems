public class SumOfRowColumn {
    public static void main(String[] args){
        int row,col,sumRow=0,sumCol=0;
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        row=a.length;
        col=a[0].length;

        for(int i=0;i<row;i++){
            sumRow=0;
            for(int j=0;j<col;j++){
                sumRow+=a[i][j];
            }
            System.out.println("sum of"+(i+1)+"row"+sumRow);

        }
        for(int i=0;i<col;i++){
            sumCol=0;
            for(int j=0;j<row;j++){
                sumCol+=a[j][i];
            }
            System.out.println("sum of"+(i+1)+"col"+sumCol);
        }

    }
}
