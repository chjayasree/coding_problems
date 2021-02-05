public class LinearSearch {
    public static void main(String[] args){


        int arr[] =new int[]{1,3,5,2,8,10};
        int item=10;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println("the element is present at "+i+"position");
            }
        }

    }
}
