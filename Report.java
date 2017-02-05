import java.util.Date;
import static java.lang.System.out;
/**
 * Created by Евгения on 05.02.2017.
 */
public class Report {
    static long DateTime () {
        Date date = new Date();
        return date.getTime();

    }


    static void DateTimeWork (long DTBegin, long DTEnd) {
//        Date DTWork = new Date();
            out.println("Начало работы: " + DTBegin);
            out.println("Начало работы: " + DTEnd);
            out.println("Время работы:  " + (DTEnd-DTBegin));
    }
}
