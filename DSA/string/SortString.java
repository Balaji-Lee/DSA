package DSA.string;




import java.util.Arrays;

public class SortString {

    public static void main(String[] str){

        // NOTE : for we have to check the letter Captial as well , that will have some differnt AASIC Value
        String inputString ="balaji";

        char[] charArray =inputString.toCharArray();
        Arrays.sort(charArray);

        System.out.println(charArray);

    }
    
}
