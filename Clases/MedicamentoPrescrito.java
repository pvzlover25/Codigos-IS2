package Clases;
import java.util.*;

public class MedicamentoPrescrito{
    private Medicamento m;
    private int frecuencia,dosis;
    private ArrayList<Hora> horas;
    private ArrayList<Ingesta> ingestas;
    public MedicamentoPrescrito(Medicamento m, int frecuencia, int dosis){
        this.m=m;
        this.frecuencia=frecuencia;
        this.dosis=dosis;
        horas=new ArrayList();
        ingestas=new ArrayList();
    }
    public void addHora(Hora h){
        horas.add(h);
    }
    public void addIngesta(Ingesta ing){
        ingestas.add(ing);
    }
    public List<Hora> getHoras(){
        return Collections.unmodifiableList(horas);
    }
    public List<Ingesta> getIngestas(){
        return Collections.unmodifiableList(ingestas);
    }
    public Medicamento getMedicamento(){
        return m;
    }
    public int getFrecuencia(){
        return frecuencia;
    }
    public int getDosis(){
        return dosis;
    }
}
