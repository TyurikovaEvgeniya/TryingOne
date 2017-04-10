import static java.lang.System.out;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Евгения on 05.02.2017.
 */
public class Dividers {
    /**
     * Поиск делителей для чисел типа Integer
     */
    static void List(int Aim, ArrayList Divs) {

        int n = (int) (Aim * 0.5) + 1;
        int j = 0;
        for (int i = 2; i <= n; i++) {
            if (Aim % i == 0) {
                Divs.add(i);
                out.println(" Индекс " + j + ". Делитель: " + Divs.get(j) + ".");
                j++;
            }
        }

    }
    /**
     * Поиск делителей для чисел типа BigInteger без решета Эратосфена
     */
   static void List(BigInteger Aim, ArrayList Divs) {
        BigInteger n, step;
        BigInteger nill = new BigInteger("0");
        BigInteger m = new BigInteger("2");
        ArrayList notDivs = new ArrayList();
        n = m;
            if (Aim.remainder(m).compareTo(nill) != 0)
                {step = m; n = m.add(BigInteger.ONE);} /** Если число нечётное нет смысла проверять чётные делители*/
                    else step = BigInteger.ONE;
               System.out.println(n+" "+ step);

        int j = 0;
        int k = 0;
        while (n.compareTo(Aim.divide(m)) <= 0) {
//            System.out.println(n+" "+m+" "+Aim.divide(m)+" "+n.compareTo(Aim.divide(m)));
            if (Aim.remainder(n).compareTo(nill) == 0) {
                m = n;
                Divs.add(n);
               out.println(" Индекс " + j + ". Делитель: " + Divs.get(j) + ".");
                j++;
                Divs.add(Aim.divide(n));
             out.println(" Индекс " + j + ". Делитель: " + Divs.get(j) + ".");
                j++;
            }
            else {
                if (IsTheNumberSimple.isPrime(n)== true) {
                notDivs.add(k,n);
                //System.out.println(n);
                k++;}
            }
            n = n.add(step);
            /** Если число кратно 5, увеличиваем делитель на шаг. Не подходит для всех случаев*/
             if (n.remainder(BigInteger.valueOf(5l)).compareTo(nill) == 0) n = n.add(step);
        }
    }

/**Не будет работать в текущей реализации, нужно добавить сортировку массива делителей числа*/
/** Добавить конструктор метода для BigInteger*/
    static void MaxSimple(ArrayList Div) {
        int i;
        for (i = Div.size() - 1; i >= 0; i--) {
            if (IsTheNumberSimple.isPrime((int) Div.get(i)) == true) {
                out.println("Максимальный простой делитель: " + Div.get(i));
                break;
            }

        }
        if (i == 0) out.println("У числа нет простых делителей");
        out.println();
    }
}
