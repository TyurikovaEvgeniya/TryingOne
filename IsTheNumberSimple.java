import java.util.ArrayList;

/**
 * Created by Евгения on 05.02.2017.
 */
public class IsTheNumberSimple {
    static Boolean isPrime(long num){ // Нужно сделать функцией
        Boolean result = false;

    if (num <= 1)
        result = false;
    if (num == 2 | num == 3)
        result = true;
    else
    {
        for (int i = 2; i*i<=num; i++)
        {
            if (num % i == 0)
            {
                result = false;
                break;
            }
            else
                result = true;
        }
    }
    return result;
    }

    static void SimpleArray(ArrayList SourceToDelete, long n) {
        int i=0;
        Array.AddNaturalNumbersToArray(SourceToDelete, n);
          while (i < SourceToDelete.size()){
              if (IsTheNumberSimple.isPrime((Integer) SourceToDelete.get(i))== false) {
                    SourceToDelete.remove(i);
                }
              else i++;
            }
    }
}
