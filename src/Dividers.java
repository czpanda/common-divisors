import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dividers {

    public static List<Integer> dividersList(int num) {
        List<Integer> result = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }

        return result;
    }

    public static int greatestCommonDivisor(int numOne, int numTwo) {
        List<Integer> divisorsOne = Dividers.dividersList(numOne);
        List<Integer> divisorsTwo = Dividers.dividersList(numTwo);

        List<Integer> commonDivisors = new ArrayList<>(divisorsOne);
        commonDivisors.retainAll(divisorsTwo);

        return Collections.max(commonDivisors);
    }
}
