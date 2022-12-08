package Clases;
import java.util.*;

public class Diagnostico {
    private String prescripcion,deteccion_enfermedad;
    private HashMap<String,Tratamiento> tratamientos;
    private ArrayList<String> observaciones;
    public Diagnostico(String prescripcion, String deteccion_enfermedad){
        this.prescripcion=prescripcion;
        this.deteccion_enfermedad=deteccion_enfermedad;
        tratamientos=new HashMap();
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
    public void addTratamiento(Tratamiento t){
       tratamientos.put(t.getID(), t);
    }
    public Tratamiento getTratamiento(String id_tr){
        return tratamientos.get(id_tr);
    } 
}
