import java.time.*;
import  java.time.format.DateTimeFormatter;

public class DateFormatter {
    private long date;
    private String format;

    public DateFormatter(){

    }
     public DateFormatter(long date){
     this.date =date;
        
    }
     public DateFormatter(long date, String f){
        this.date =date;
        if (f != null) this.format = f.toUpperCase();
        
    }
    public void setDate(long d){
        this.date =d;
    }
    public void setFormat(String f){
        if (f != null) this.format =f.toUpperCase();
    }

    public long getDate() {
        return date;
    }
    public String getFormat() {
        return format;
    }
    public String getFormattedDate() {
        LocalDate d = LocalDate.ofEpochDay(date/(3600*24));
        return switch(format){
            case "DD.MM.YYYY" ->d.format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
            case "DD MONTH YYYY" -> d.format(DateTimeFormatter.ofPattern("dd MMMM uuuu"));
            default ->d.format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
        };
    }
    //  public String getFormattedDate() {
    //     LocalDate d = LocalDate.ofEpochDay(date / (24*60*60));
    //     return switch (format) {
    //         case "DD.MM.YYYY" -> d.format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
    //         case "DD MONTH YYYY" -> d.format(DateTimeFormatter.ofPattern("dd MMMM uuuu"));
    //         default -> d.format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
    //     };
    // }
    /*
    DD/MM/YYYY
    DD Month YYYY
    DD.MM.YYYY
 */

}

/*public class DateFormatter {
    private long date;
    private String format;

    public DateFormatter() {
    }
    public DateFormatter(long date) {
        this.date = date;
    }
    public DateFormatter(long date, String format) {
        this.date = date;
        if (format != null) this.format = format.toUpperCase();
    }
    public void setDate(long date) {
        this.date = date;
    }
    public void setFormat(String format) {
        if (format != null) this.format = format.toUpperCase();
    }
    public long getDate() {
        return date;
    }
    public String getFormat() {
        return format;
    }

    public String getFormattedDate() {
        LocalDate d = LocalDate.ofEpochDay(date / (24*60*60));
        return switch (format) {
            case "DD.MM.YYYY" -> d.format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
            case "DD MONTH YYYY" -> d.format(DateTimeFormatter.ofPattern("dd MMMM uuuu"));
            default -> d.format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
        };
    }
} */