public class MatricesSubtraction {
    public static void main(String args[]){
        int a[][]={{10,24,6},{41,54,67},{71,83,93}};
        int b[][]={{2,3,4},{5,6,7},{7,8,9}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]+" ");
            }

            System.out.println();
        }
    }
}
