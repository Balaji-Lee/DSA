public class PrintNameArray {
    /*
     * Task:
     * Create a character array with your name and print it letter by letter.
     * 
     * input
     * char[] name = {'B', 'A', 'L', 'A', 'J', 'I'};
     * 
     * Output
     * B A L A J I
     */

    public static void main(String[] arg) {

        char[] name = new char[] { 'B', 'A', 'L', 'A', 'J', 'I' };
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }

        for(char c :name){
            System.out.print(c);
        }


    }

}
