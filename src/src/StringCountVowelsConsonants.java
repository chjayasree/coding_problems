public class StringCountVowelsConsonants {
    public static void main(String[] args){
        int cCount=0 ,vCount=0;
        String str="i am not faithful";
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vCount++;
            }

            else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                cCount++;
            }
        }
        System.out.println("the vowels count is :"+vCount);
        System.out.println("the consonants count is :"+cCount);
    }
}
