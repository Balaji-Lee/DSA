package DSA.array;

import java.util.ArrayList;

public class ExtractTheIntegers {

    public static void main(String[] args) {

       ArrayList<String> result =extractIntegerWords("1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56");

       System.out.println(result);
    }
   public static ArrayList<String> extractIntegerWords(String s) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder num = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num.append(ch);
            }else{
                if(!num.isEmpty()){
                    result.add(num.toString());
                    num.setLength(0);
                }
            }
        }

        if(!num.isEmpty()){
            result.add(num.toString());
        }

        if (result.isEmpty()) {
            result.add("No Integers");
        }
        return result;


    }
}
