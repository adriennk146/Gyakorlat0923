package ap.hu;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Auto {

    String rendszam;
    LocalTime idopont;

    public Auto(String adatok){
        String[] sor = adatok.split(";");
        String[] idoS = sor[1].split(":");
        this.rendszam = sor[0];
        this.idopont=LocalTime.of(Integer.parseInt(idoS[0]),Integer.parseInt(idoS[1]));
    }

    private String getSzepRendszam(){
        return String.format("%s",this.rendszam.substring(0,3)+"-"+this.rendszam.substring(3,6));
    }

    public LocalTime getIdopont(){
        return this.idopont;
    }

    public String toString() {
         return String.format("%s %s",this.getSzepRendszam(),this.idopont);
    }
}
