public class LargestOfThree {

    public static void main(String[] args){

        int a = 10;
        int b = 20;
        int c = 115;

        int bigVal;
        if(a <= b && b >= c){
            bigVal = b;
        }else if(b <= a && a >=c ){
            bigVal = a;
        }else{
            bigVal =c;
        }
        
        System.out.println("The Big Val is :" + bigVal);
    }

}
