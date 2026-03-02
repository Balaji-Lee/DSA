public class ToggleChar {

    
    public static void main (String[] args){

        String input = "BalaJI";
        char[] convertedArray = input.toCharArray();
        for(int i = 0; i <= input.length()-1;i++){

            if(Character.isLowerCase(convertedArray[i])){
                convertedArray[i] = Character.toUpperCase(convertedArray[i]);
            }else{
                convertedArray[i] = Character.toLowerCase(convertedArray[i]);
            }
        }

        System.out.println(new String(convertedArray));

    }


}
