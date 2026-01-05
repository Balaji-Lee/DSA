public class FibonacciSeries {
    public static void main(String[] args) {
        
        int input =10;
        for(int x : FibonacciSeries(input) ){
            System.out.print(x +":");
        }
    
    }

   public static int[] FibonacciSeries(int input){

        int[] result = new int[input];
        result[0] =0;
        result[1] =1;
        for(int i=2; i <= input-1 ;i++){
             result[i] = result[i-1] + result[i-2];
        }
        return result;

    } 
}


