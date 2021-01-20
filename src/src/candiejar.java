public class candiejar {

    public static void main(String[] args){

        int n=10,k=5,num=4;

        if(num>=1&&num<=5){
            System.out.println("NUMBER OF CANDIES SOLD :"+num);
            System.out.println("NUMBER OF CANDIES AVAILABLE :"+(n-num));
        }
        else{
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT : "+n);
        }


    }

}
