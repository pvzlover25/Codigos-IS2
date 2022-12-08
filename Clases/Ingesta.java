package Clases;
import java.util.Date;
import java.text.SimpleDateFormat;

public record Ingesta(Date dia, Date hora){
    public String toString(){
        SimpleDateFormat sdf=new SimpleDateFormat("d-M-y");
        String ret=sdf.format(dia)+" ";
        sdf=new SimpleDateFormat("H:mm");
        ret+=sdf.format(hora);
        return ret;
    }
}
