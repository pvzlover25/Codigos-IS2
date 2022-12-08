package Clases;
import java.util.*;

public class Tratamiento {
    private Date fecha_inicio,fecha_termino;
    private String id;
    private HashMap<String,MedicamentoPrescrito> prescripciones;
    public Tratamiento(Date inicio, Date termino, String id){
        fecha_inicio=inicio;
        fecha_termino=termino;
        this.id=id;
    }
    public double consultarAdherenciaGlobal(Date fecha1, Date fecha2, int frecuencia){
        int cont=0;
        for(MedicamentoPrescrito mp:prescripciones.values()){
            for(Ingesta ing:mp.getIngestas()){
                Date dia=ing.dia();
                if(dia.compareTo(fecha1)>=0 && dia.compareTo(fecha2)<=0) cont++;
            }
        }
        return calculoAdherencia(cont, fecha1, fecha2, frecuencia);
    }
    public double consultarAdherenciaDetallada(int umbral, Date fecha1, Date fecha2, int frecuencia){
        int cont=0;
        for(MedicamentoPrescrito mp:prescripciones.values()){
            for(Hora h:mp.getHoras()){
                GregorianCalendar gc=new GregorianCalendar();
                gc.setTime(h.hora_notificada());
                int horaIdeal=Objects.hash(gc.get(Calendar.HOUR),gc.get(Calendar.MINUTE));
                cont+=count(mp.getIngestas(),fecha1,fecha2,horaIdeal-umbral,horaIdeal+umbral);
            }
        }
        return calculoAdherencia(cont, fecha1, fecha2, frecuencia);
    }
    private int count(List<Ingesta> ingestas, Date fecha1, Date fecha2, int inf, int sup){
        int ret=0;
        //Calcular count en base a fecha1, fecha2, inferior y superior
        return ret;
    }
    private double calculoAdherencia(int cont, Date fecha1, Date fecha2, int frecuencia){
        GregorianCalendar gc=new GregorianCalendar();
        gc.setTime(fecha1);
        int f1=gc.get(Calendar.DAY_OF_YEAR);
        gc.setTime(fecha2);
        int f2=gc.get(Calendar.DAY_OF_YEAR);
        if(f2<f1) f2+=365;
        int den=(f2-f1)*frecuencia;
        double ret=(double)cont/den;
        return ret*100.0;
    }
    public void addPrescripcion(MedicamentoPrescrito mp){
        prescripciones.put(mp.getID(), mp);
    }
    public MedicamentoPrescrito getPrescripcion(String id_mp){
        return prescripciones.get(id_mp);
    }
    public Date getFechaInicio(){
        return fecha_inicio;
    }
    public Date getFechaTermino(){
        return fecha_termino;
    }
    public String getID(){
        return id;
    }
}
