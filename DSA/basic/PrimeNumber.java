public class PrimeNumber {

    public static void main(String[] args) {
        
        int input =13;
        System.out.println("Check whether Pime number "+ input +":"+ isPrimeNumber(input));
    }

    public static String isPrimeNumber(int input){

        if(input <= 1 ){
            return "Not Prime";
        }else{
            for(int i=2; input >= i * i; i++){
                if(input % i == 0)
                    return "Not Prime";
            } 
        }
         return "Prime";
    }
}
