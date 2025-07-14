public class RotateArrayRightByOne {

    public static void main(String[] arg){

        int[] myArray = new int[]{1,2,3,4,5,0};
        int temp =myArray[myArray.length-1];

        System.out.println("Before Rotate to the Right :: ");
        for(int n: myArray){
            System.out.print(n);
        }

        for(int i=myArray.length-1;i>0;i--){
            myArray[i] =myArray[i-1];
        }
        myArray[0] =temp;

        System.out.println(" After Rotate to the Right ::");
        for(int n: myArray){
            System.out.print(n);
        }

    }
}
