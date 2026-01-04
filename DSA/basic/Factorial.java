public class Factorial {

    public static void main (String[] args){

         int input =3;
        System.out.println("Fine Factorial number for "+ input +":"+ factorialNumber(input));
    }

    public static int factorialNumber(int input){
        if(input <= 0)
            return -1;

        int result =1;
        for(int i=1 ; i <= input ; i++){
            result = result*i;
        }
        return result;
    }

}
