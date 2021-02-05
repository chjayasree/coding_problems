public class LinearSearchString {
    public static void main(String[] args){


        String arr[] =new String[]{"bhavya","deepak","rohith"};
        String item="DEEPAK";
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(item)){
                System.out.println("the element is present at "+i+"position");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("item is not found");
        }

    }

}
