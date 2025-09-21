
public class task2 {
    public static void main(String[] args) {

        int x = 2;
        int num = 4;
        double sum = 0.0;
        for (int i = 1; i <= num; i++) {
            double res = 1;
            for (int j = 0; j < i; j++) {
                res *= x;
            }
            double res2 = 1;
            for (int k = i; k >= i; k--) {
                res2 *= k;
            }

            double div = res / res2;
            sum += div;

        }
        System.out.println(sum);

    }

}
