public class SumOfDigits {

    public static void main(String[] args){

        System.out.println("Sum of Give number -1234 is : " + sumOfDigits(-1234));
    }

    public static int sumOfDigits(int input){

        int result = 0;
        while(input != 0){
            int remainder = input % 10;
            result = remainder + result ;
            input = input / 10;
        }

        return  result; 
    }
    
}
