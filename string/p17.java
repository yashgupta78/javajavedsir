/*
WAP to use the most used string buffer method
 */
public class p17 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I like java");
        System.out.println(sb);
        sb.append("Programming");
        System.out.println(sb);
        sb.insert(11 , ' ');
        System.out.println(sb);
        sb.replace(2,6,"love");
        System.out.println(sb);
        sb.delete(7,11);
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
