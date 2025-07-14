
import java.util.ArrayList;

class RemoveDeplicatesfromAnArray{

    public static void main(String[] arg){

        int[] arr = {5, 2, 3,4, 2, 1, 4};
        
        ArrayList<Integer> unique = new ArrayList<>();        
        for(int i=0;i<arr.length;i++){
            if(!unique.contains(arr[i])){
                unique.add(arr[i]);
            }
        }
        for(int v:unique){
           System.out.println(v); 
        }


    
    }

}