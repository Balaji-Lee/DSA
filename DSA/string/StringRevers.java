package DSA.string;

public class StringRevers {

    public static void main(String[] args) {
        String str = "Hello";

        int p1 = 0;
        int p2 = str.length() - 1;
        StringBuilder sb = new StringBuilder(str);

        while (p1 != p2) {
            char temp = str.charAt(p2);
            sb.setCharAt(p2, str.charAt(p1));
            sb.setCharAt(p1, temp);
            p1++;
            p2--;

        }

        str = sb.toString();
        System.out.println(str);
    }

}
