  abstract class Factorial {
    public abstract long calculate(int n);
}

  class IterativeFactorial extends Factorial {
    @Override
    public long calculate(int n) {
      if (n == 0 ) {
        return 1;
      }
      long res = 1;
      for (int i = n;i > 1 ; i--) {
        res *= i;

      }
      return res;
    }
}

public class RecursiveFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        
       if (n == 0 ) {
        return 1;
      }

      return n * calculate(n-1);
    }
}