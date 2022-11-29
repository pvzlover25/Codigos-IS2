package Clases;
import java.util.Date;
import java.text.SimpleDateFormat;

public record Consulta(Date fecha, Diagnostico d, Paciente p) {
    public String toString(){
        SimpleDateFormat sdf=new SimpleDateFormat("d-M-y");
        return sdf.format(fecha);
    }
}
