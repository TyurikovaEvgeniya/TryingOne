import static java.lang.System.out;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Евгения on 05.02.2017.
 */
public class Dividers {
    static void List(int Aim, ArrayList Divs) {

        int n = (int) (Aim *0.5) + 1;
        int j = 0;
        for (int i = 2; i <= n; i++) {
            if (Aim % i == 0) {
                Divs.add(i);
//                out.println(" Индекс " + j + ". Делитель: "+ Divs.get(j)+ ".");
                j++;
            }
        }

    }

    public class Dividers {
        static void List(long Aim, ArrayList Divs) {

            int n = (int) (Aim *0.5) + 1;
            int j = 0;
            for (int i = 2; i <= n; i++) {
                if (Aim % i == 0) {
                    Divs.add(i);
//                out.println(" Индекс " + j + ". Делитель: "+ Divs.get(j)+ ".");
                    j++;
                }
            }

        }


        public class Dividers {
            static void List(BigInteger Aim, ArrayList Divs) {

                int n = (int) (Aim *0.5) + 1;
                int j = 0;
                for (int i = 2; i <= n; i++) {
                    if (Aim % i == 0) {
                        Divs.add(i);
//                out.println(" Индекс " + j + ". Делитель: "+ Divs.get(j)+ ".");
                        j++;
                    }
                }

            }

            static void MaxSimple(ArrayList Div) {
        int i;
        for (i = Div.size()-1; i>=0; i--) {
           if (IsTheNumberSimple.isPrime((int)Div.get(i)) == true) {
                out.println("Максимальный простой делитель: " + Div.get(i));
                break;
            }

        }
        if (i == 0) out.println("У числа нет простых делителей");
        out.println();
    }
}