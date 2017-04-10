import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Евгения on 05.02.2017.
 */
public class IsTheNumberSimple { /** Проверка является ли число простым*/
     static Boolean isPrime(long num){
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

    static Boolean isPrime(BigInteger num) {

        BigInteger nill = new BigInteger("0");
        BigInteger bi1 = new BigInteger("1");
        BigInteger bi2 = new BigInteger("2");
        BigInteger bi3 = new BigInteger("3");
        BigInteger count;
        Boolean result = false;
        if (num.compareTo(bi1) == 0) result = false;
        if (num == bi2 | num == bi3) result = true;

        else {
                if (num.isProbablePrime(2) == true) {
//                    System.out.println("Возможно простое");
                    for (count = bi2; count.compareTo(num.divide(bi2)) < 0; count = count.add(BigInteger.ONE)) {
                        //System.out.println("Делитель "+count);
                        if (num.divide(count).compareTo(nill) == 0) {
                            result = false;
                            break;
                        } else
                            result = true;
                    }
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
