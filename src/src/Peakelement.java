public class Peakelement {
    public static void main(String[] args) {
        int a[]={5,17,100,11};
        int n=a.length;
        int low=0;
        int high=n-1;
        int mid=0;

        while(low<=high)
        {
            mid=(low+high)/2;

            if(mid==0||mid==n-1)
                break;



            else if(a[mid]>=a[mid-1]&& a[mid]<=a[mid+1])
                low=mid+1;

            else if(a[mid]>=a[mid+1]&&a[mid]<=a[mid-1])
                high=mid-1;

            else
                break;



        }

        System.out.println(a[mid]+" ");
    }

}
