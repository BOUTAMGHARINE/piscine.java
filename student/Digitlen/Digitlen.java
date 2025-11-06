



public class Digitlen {
    public static int digitlen(long number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        if (number < 0) {
            number*= -1;
        }

        while (number > 0 ) {
            count++;
            number/=10;
            
        }
        return count;
    }
}