
import java.util.ArrayList;
/**
 * Created by Евгения on 29.01.2017.
 */
public class MyTest {
    public ArrayList<Integer> isPrime(int n){
        ArrayList<Integer> S = new ArrayList<Integer>(2);
        int k,l;
        S.set(1, 0); // 1 - не простое число
        // заполняем решето единицами
        for(k=2; k<=n; k++)
            S.set(k, 1);

        for(k=2; k*k<=n; k++){
            // если k - простое (не вычеркнуто)
            if(S.get(k) ==1){
                // то вычеркнем кратные k
                for(l=k*k; l<=n; l+=k){
                    S.set(l, 0);
                }
            }
        }
        return S;
    }
}



