import java.util.ArrayList;
import  java.util.Date;

import static java.lang.System.out;

/**
 * Created by Евгения on 30.01.2017.
 */
class Task3 {
    public static void main(String[] args) {
        long DTBegin = Report.DateTime();
        long DTEnd;
        int Aim = 13195; // Значение для проверки алгоритма = 13195; Целевое значение = 600851475143;
        ArrayList D = new ArrayList(Aim);
        Dividers.List(Aim , D);
        out.println("Делители числа:");
        Array.Print(D);
        out.println();
        Dividers.MaxSimple(D);
        DTEnd = Report.DateTime();
        Report.DateTimeWork(DTBegin, DTEnd);

    }
}



