/*
How to use string buffer class method
 */
public class p16 {
    public static void main(String[] args) {
        String s = "qSpiders";
        s.concat(" thane");  // Immutable
        System.out.println(s);

        StringBuffer sb = new StringBuffer("qSpiders");
        sb.append(" Thane"); // mutable
        System.out.println(sb);
    }
}
