package Clases;
import java.util.*;

public class Diagnostico {
    private String prescripcion,deteccion_enfermedad;
    private Tratamiento t;
    private ArrayList<String> observaciones;
    public Diagnostico(String prescripcion, String deteccion_enfermedad, Tratamiento t){
        this.prescripcion=prescripcion;
        this.deteccion_enfermedad=deteccion_enfermedad;
        this.t=t;
        observaciones=new ArrayList();
    }
    public String getDeteccionEnfermedad(){
        return deteccion_enfermedad;
    }
    public String getPrescripcion(){
        return prescripcion;
    }
    public void addObservacion(String obs){
        observaciones.add(obs);
    }
    public List<String> getObservaciones(){
        return Collections.unmodifiableList(observaciones);
    }
    public Tratamiento getTratamiento(){
        return t;
    }
}
