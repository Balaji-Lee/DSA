public class ReverseNumber {
    public static void main(String[] args){

        int input =132777;
        int result =0;

        while(input !=0){
            int remainder = input % 10;
            result = result * 10 + remainder;
            input = input /10;
        }

        System.out.println("My Reverse Number :"+result );

    }
}
