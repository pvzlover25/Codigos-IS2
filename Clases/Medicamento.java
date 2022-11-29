package Clases;
import java.util.*;

public class Medicamento {
    private String id,nombre;
    private ArrayList<String> composicion;
    private int frecuencia,dosis;
    private Tratamiento t;
    public Medicamento(String id, String nombre, int frecuencia, int dosis, Tratamiento t){
        this.t=t;
        this.id=id;
        this.nombre=nombre;
        this.frecuencia=frecuencia;
        this.dosis=dosis;
        composicion=new ArrayList();
    }
    public void addComposicion(String cmp){
        composicion.add(cmp);
    }
    public List<String> getComposicion(){
        return Collections.unmodifiableList(composicion);
    }
    public String getID(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getFrecuencia(){
        return frecuencia;
    }
    public int getDosis(){
        return dosis;
    }
    public Tratamiento getTratamiento(){
        return t;
    }
}
