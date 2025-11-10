import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

     SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public ProjectTime(String start, String end) {
        this.startTime = start;
        this.endTime = end;
        updateHoursLogged();
    }

    public void setStartTime(String newValue) {
        this.startTime = newValue;
        updateHoursLogged();
    }

    public void setEndTime(String newValue) {
        this.endTime = newValue;
        updateHoursLogged();
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getHoursLogged() {
        if (hoursLogged == -1) {
            return "-1";
        }

        float minutes = hoursLogged * 60;

        if (minutes < 120) { // moins de 2 heures
            return ((int) minutes) + " m";
        } else if (hoursLogged < 120) { // moins de 120 heures
            return ((int) hoursLogged) + " h";
        } else if (hoursLogged < 120 * 24) { // moins de 120 jours
            return ((int) (hoursLogged / 24)) + " d";
        } else { // 120 jours et plus
            return ((int) (hoursLogged / (24 * 30))) + " mo";
        }
    }

    private void updateHoursLogged() {
        try {
            Date dateS = DATE_FORMAT.parse(startTime);
            Date dateE = DATE_FORMAT.parse(endTime);

            long diffMillis = dateE.getTime() - dateS.getTime();
            if (diffMillis < 0) { // fin avant début
                hoursLogged = -1;
            } else {
                hoursLogged = diffMillis / (1000f * 60 * 60); // conversion millisecondes → heures
            }
        } catch (ParseException e) {
            hoursLogged = -1; // erreur de parsing
        }
    }
}
