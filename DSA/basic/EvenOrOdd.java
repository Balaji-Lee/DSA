package DSA.basic;

public class EvenOrOdd {
    public static void main(String[] arg){
        System.out.println("Check Value for  5 :" + checkOddOrEven(5));
    }      

    public static String checkOddOrEven (int val){
        if(val%2 == 0)
            return "Even";
        else
            return "Odd";
    }

}