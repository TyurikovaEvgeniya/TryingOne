import java.math.BigInteger;
import java.util.ArrayList;
import static java.lang.System.out;

/**
 * Created by Евгения on 30.01.2017.
 */
class Task3 {
    public static void main(String[] args) {
       long start = System.currentTimeMillis();
        BigInteger Aim; // Значение для проверки алгоритма = 13195; Целевое значение = 600851475143;
        Aim = BigInteger.valueOf(600851475143l);
        ArrayList D = new ArrayList();
        Dividers.List(Aim , D);
        out.println("Делители числа:");
        Array.Print(D);
        out.println();
        Dividers.MaxSimple(D);
        long stop = System.currentTimeMillis();
        Report.DateTimeWork(start, stop);


    }
}



