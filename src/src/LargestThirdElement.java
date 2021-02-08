public class LargestThirdElement {
    public static void main(String[] args){
        int arr[]={1,2,34,54,67,24};
        int n=arr.length,temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }


        System.out.println("the third largest element in array is :"+arr[n-3]);

    }
}
