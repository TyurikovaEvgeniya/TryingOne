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
        Aim = new BigInteger("600851475143");
        ArrayList D = new ArrayList();
        Dividers.List(Aim , D);

            if (D.size() == 0)
                System.out.println("Число простое");
                else {
                out.println("Делители числа:");
                Array.Print(D);
            }

        out.println();
        Dividers.MaxSimple(D);
        long stop = System.currentTimeMillis();
        Report.DateTimeWork(start, stop);


    }
}



