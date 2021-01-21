public class Palindrome {
    public static void main(String[] args){
        int r,sum=0,temp=0,n=154;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(sum+" it is an palindrome");
        }
        else{
            System.out.println(sum+"it is not a palindrome");
        }
    }

}
