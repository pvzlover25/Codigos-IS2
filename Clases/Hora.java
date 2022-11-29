package Clases;
import java.util.Date;
import java.text.SimpleDateFormat;
        
public record Hora(Date hora_notificada) {
    public String toString(){
        SimpleDateFormat sdf=new SimpleDateFormat("H:mm");
        return sdf.format(hora_notificada);
    }
}
