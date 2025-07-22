package DSA.pattens;

public class NPatten {

    public static void main(String[] args) {

        int n = 8;
        int val = 1;
        int rowVal = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < rowVal; j++) {
                System.out.print(" "+val);
                val++;
            }
             System.out.println();
            rowVal++;
        }

    }

}
