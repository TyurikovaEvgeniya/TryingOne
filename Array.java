import java.util.ArrayList;
import static java.lang.System.out;

/**
 * Created by Евгения on 05.02.2017.
 */
public class Array {
    static void Print(ArrayList Source) { //Вывод массива на экран
        for (int i=0; i<Source.size(); i++){
            out.print(Source.get(i)+" ");
            if (i % 50 == 0 & i != 0) out.println();
        }
        out.println();
    }
    static void AddNaturalNumbersToArray(ArrayList Source, long n) {
        for (int i = 2; i <= n; i++) { //Заполнение массива чмислами от двух до n;
            Source.add(i-2,i);
        }
    }
    static void PrintBack (ArrayList Source, int step) {
        out.println("N чисел из массива по убыванию:");
        for (int i=Source.size(); Source.size()-i <= step; i--) {
            out.print(Source.get(i));
        }
    }
}