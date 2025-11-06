


public class NextPrime {
    public static Integer nextPrime(Integer n) {
           System.out.println("ttttttttttttttttttttttttttttttttttttt "+n);
           if (n < 0) {
            return 2;
           }
        n++;
        while (!isprime(n)) {
            n++;
        }
        return n;

    }

     public static boolean isprime(Integer n) {
        if (n  == 2) {
            return true;
        }
          if (n  == 1) {
            return false;
        }
        if (n % 2 == 0 ) {
            return false;
        }
       for(int i = n-1 ; i > 2; i--) {
        if(n % i == 0) {
            return false;
        }
       }
       return true;
     }
     public static void main(String[] args) {
        System.out.println(NextPrime.nextPrime(3));
    }
}