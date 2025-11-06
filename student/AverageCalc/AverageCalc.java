


public class AverageCalc {
    public static int average(int start, int end, int step) {
        Boolean isnegative = false;
   
      
        System.out.println(start+"vsvs"+end+"vsvs"+step);
        int sum = 0;
        int count = 0;

        if (step > 0  && (start <= end)){
        for (int i =start;i <= end; i+= step){
            sum += i;
            count += 1;
        }
        } else if (step < 0 && (start >= end)) {
            for (int i =start;i >= end; i+= step){
            sum += i;
            count += 1;
        }
        }else {
            return 0;
        }


        return sum / count ;
    }
        public static void main(String[] args) {
        System.out.println(AverageCalc.average(1,10,2));
    }
}
//1  3   5   7  9  10
//