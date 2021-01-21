public class Factorial {
    public static void main(String[] args){
        int i,fact=1,number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }

        System.out.println(fact+"is the factorial of a given number");

    }
}
