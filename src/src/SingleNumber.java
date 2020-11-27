public class SingleNumber {
    public static void main(String args[]){
        int A[]={1,2,2,3,1};

        int x=0;
        for(int i=0;i<A.length;i++){
            x=x^A[i];
        }
        System.out.println("the single number is"+x);
    }
}
