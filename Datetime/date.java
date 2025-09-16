package Datetime;
import java.time.LocalDate;
import java.time.LocalTime ; 
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now() ; 
        System.out.println(myObj);
        LocalTime myTime = LocalTime.now() ;
        System.out.println(myTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = myObj.format(myFormatObj);
        System.out.println(formattedDate);
        Date mydate = new Date() ;  
        System.out.println(mydate);
    }
}
