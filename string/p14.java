/*
WAP to sort the string in lexicographically order.
 */
public class p14 {
    public static void main(String[] args) {
        String[] str = {"hi","welcome","thane","bye"};
        /*output : bye
                   hi
                   thane
                   welcome
         */
        for(int i =0;i<str.length; i++){
            for(int j =0;j<str.length-1-i;j++){
                if(str[j].compareTo(str[j+1]) > 0){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        for(String s : str ){
            System.out.println(s);
        }
    }
}
