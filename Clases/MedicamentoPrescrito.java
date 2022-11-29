package Clases;
import java.util.*;

/**
 *
 * @author marag
 */
public class MedicamentoPrescrito{
    private Medicamento m;
    private int frecuencia,dosis;
    private ArrayList<Hora> horas;
    public MedicamentoPrescrito(Medicamento m, int frecuencia, int dosis, Hora h){
        this.m=m;
        this.frecuencia=frecuencia;
        this.dosis=dosis;
        horas=new ArrayList();
        horas.add(h);
    }
    public void addHora(Hora h){
        horas.add(h);
    }
    public List<Hora> getHoras(){
        return Collections.unmodifiableList(horas);
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
