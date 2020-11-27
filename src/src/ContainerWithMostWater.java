public class ContainerWithMostWater {
    public static int maxArea(int[] A,int len) {
        int i=0;
        int j=A.length-1;
        int area=0;
        while(i<j){
            area=Math.max(area,Math.min(A[i],A[j])*(j-i));
            if(A[i]<=A[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return area;
    }
    public static void main(String[] args)
    {
        int a[] = {1, 5, 4, 3};
        int b[] = {3, 1, 2, 4, 5};

        int len1 = 4;
        System.out.println( maxArea(a, len1));

        int len2 = 5;
       System.out.print( maxArea(b, len2) );
    }
}

