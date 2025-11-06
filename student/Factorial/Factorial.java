

public class Factorial {
    public static Integer factorial(Integer n) {
        int res = 1;
        while ( n > 0) {
            res *= n;
            n--;

        }
        return res;
    }
}