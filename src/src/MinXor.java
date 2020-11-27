import java.util.*;
public class MinXor {
   
    public static void main(String args[]){
        int a[]={20,6,10,4};
        Arrays.sort(a);
        int n=a.length;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            int x=a[i]^a[i-1];

            if(x<min)
                min=x;
        }
        System.out.println("the minimum is :"+min);
    }
}
