import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

    private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public ProjectTime(String start, String end){
        this.startTime = start;
        this.endTime = end;

        UpdatHoursLogged();
    
    }

    public void setStartTime(String start){
        this.startTime =start;
        UpdatHoursLogged();

    }
    public void setEndTime(String end){
        this.endTime =end;
        UpdatHoursLogged();

    }

    public String getStartTime(){
        return this.startTime;

    }
    public String getEndTime(){
        return this.endTime;
    }

    public String getHoursLogged(){

        if (hoursLogged == -1) {
            return "-1";
        }
        float timeInMinut = hoursLogged * 60;
        if (timeInMinut < 120) {
            return (int)timeInMinut + " m";
        }else if (hoursLogged < 120 ) {
            return (int) hoursLogged +" h";
        }else if ((hoursLogged/24f)<120){
            return  (int)(hoursLogged/24f) +" d";
        }else {
            return (int) (hoursLogged / (24f * 30f)) + " mo";

        }


    }


    public void UpdatHoursLogged() {
        try {
            Date sdate = DATE_FORMAT.parse(startTime);
            Date edate = DATE_FORMAT.parse(endTime);
            float value = edate.getTime() - sdate.getTime();
            if (value < 0) {
                this.hoursLogged = -1;
                return ;
            }else {
                float timeInhoure = value/(3600 * 1000f); 
                this.hoursLogged =timeInhoure;
            }
            
        }catch(Exception e){
            this.hoursLogged = -1;
            return;
        }
    }
}