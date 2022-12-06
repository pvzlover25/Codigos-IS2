package Clases;
import java.util.Date;
import java.text.SimpleDateFormat;

public record Ingesta(Date fecha, Date hora){
    public String toString(){
        SimpleDateFormat sdf=new SimpleDateFormat("d-M-y");
        String ret=sdf.format(fecha)+" ";
        sdf=new SimpleDateFormat("H:mm");
        ret+=sdf.format(hora);
        return ret;
    }
}
