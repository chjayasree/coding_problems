public class CopyElements {
    public static void main(String[] args){
        int arr1[]=new int[]{1,2,3,4,5};
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println("elements of an original array");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("elements of an 2 nd array");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
