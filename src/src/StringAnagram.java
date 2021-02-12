import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args){
        String str1="Grab";
        String str2="Brag";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("these are not anagram");
        }
        else{
            char string1[]=str1.toCharArray();
            char string2[]=str2.toCharArray();


            for (char[] chars : Arrays.asList(string1, string2)) {
                Arrays.sort(chars);
            }
            if(Arrays.equals(string1,string2)){
                System.out.println("they are anagram");
            }
            else{
                System.out.println("they are not anagram");
            }
        }
    }
}
