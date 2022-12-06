package Clases;
import java.util.*;

public class Tratamiento {
    private Date fecha_inicio,fecha_termino;
    private String receta;
    private ArrayList<MedicamentoPrescrito> prescripciones;
    public Tratamiento(Date inicio, Date termino, String receta){
        fecha_inicio=inicio;
        fecha_termino=termino;
        this.receta=receta;
        prescripciones=new ArrayList();
    }
    public void addPrescripcion(MedicamentoPrescrito mp){
        prescripciones.add(mp);
    }
    public List<MedicamentoPrescrito> getPrescripciones(){
        return Collections.unmodifiableList(prescripciones);
    }
    public Date getFechaInicio(){
        return fecha_inicio;
    }
    public Date getFechaTermino(){
        return fecha_termino;
    }
    public String getReceta(){
        return receta;
    }
}
