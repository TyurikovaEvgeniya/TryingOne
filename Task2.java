/**
 * Created by user on 24.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int a, b, sum;
        a = 1;
        b = 2;
        sum = 0;
        do {
            if (b % 2 == 0)
                sum += b;
            if (a % 2 == 0)
                sum += a;
            a += b;
            b += a;
        }
        while (a <= 4000000);
        System.out.println("Сумма " + sum);

    }
}