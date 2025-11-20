

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeFinder {
    public int calculateAge(String date) {
        // Implementation to calculate the age from the given date
        try {
            LocalDate b =LocalDate.parse(date);
            LocalDate n =LocalDate.now();
            if (b.isAfter(n)){
                return -1;
            }
            return Period.between(b,n).getYears();

        }catch(Exception e){
            return -1;
        }
    }
}