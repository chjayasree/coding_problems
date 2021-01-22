public class Armstrongnumber {
    public static void main(String[] args){
        int a,c=0,temp=0,m=153;
        temp=m;
        while(m>0){
            a=m%10;
            m=m/10;
            c=c+(a*a*a);
        }
        if(temp==c){
            System.out.println(c+" is an armstrong number");
        }
        else {
            System.out.println(c+" is not an armstrong number");
        }
    }
}
