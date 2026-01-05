public class PalindromeNumber {

    public static void main(String[] args){

        int input =12321;

        if(input == reverseNumber(input)){
            System.out.println(input+" is Palindrom" );
        }else{
            System.out.println(input+" is Not a Palindrom" );
        }  
    }

    public static int reverseNumber(int val){
        int result = 0;
        while(val != 0){
           int remainder = val % 10;
           result = result * 10 + remainder;
           val = val / 10 ;
        }
        return result;
    }
    
}
