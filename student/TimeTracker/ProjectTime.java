import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

    private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public ProjectTime(String start, String end){
        this.startTime=start;
        this.endTime=end;
        UpdatHoursLogged();
   
    
    }

    public void setStartTime(String start){
        this.startTime=start;
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
        if (hoursLogged == -1 ) {
            return "-1";

        }

        float timeInm = hoursLogged * 60f;
        float timeInd = hoursLogged / 24.f;

        if (timeInm < 120 ){
            return (int)timeInm +" m";
        }else if (hoursLogged < 120) {
            return (int)hoursLogged + " h";
        }else if (timeInd < 120) {
            return (int) timeInd +" d";
        }else {
            return (int)(timeInd/30f) + " mo";
        }

}


    public void UpdatHoursLogged() {

        try{

        Date st = DATE_FORMAT.parse(this.startTime);
        Date et = DATE_FORMAT.parse(this.endTime);
        float timeInmeli = et.getTime() - st.getTime();
        if (timeInmeli < 0) {
            this.hoursLogged = -1;
            return ;
        }
        float timeInh = timeInmeli / (1000 * 3600f);
        this.hoursLogged =timeInh;

        }catch(Exception e){
            this.hoursLogged =-1;
            return ;


        }


    }
      
}