
public class p12 {

    public static void main(String[] args) {
        int n = 2514795;
        int sum_evennumber = 0;
        int sum_oddnumber = 0;
        while (n != 0) {
            int last_digit = n % 10;
            if (last_digit % 2 == 0) {
                sum_evennumber = sum_evennumber + last_digit;
            } else {
                sum_oddnumber = sum_oddnumber + last_digit;
            }
            n = n / 10;
        }
        System.out.println(sum_evennumber * sum_oddnumber);
    }
}
