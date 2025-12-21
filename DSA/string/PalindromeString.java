package DSA.string;

public class PalindromeString {

    public static void main(String[] arg){

        String initString ="MADAM";
        String outPutString ="";

        for (int i = initString.length() -1; i>=0; i--){
            outPutString += initString.charAt(i);
        }

        if(initString.equals(outPutString)){
            System.out.println("Palindrome :"+"YES");
        }else{
            System.out.println("Palindrome :"+"NO");

        }


    }

}
