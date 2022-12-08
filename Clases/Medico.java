package Clases;
import java.util.*;

public class Medico{
    private String rut,nombre;
    private CatalogoMedicamento catalogo;
    private Consulta c;
    public Medico(String rut, String nombre, Diagnostico d){
        this.rut=rut;
        this.nombre=nombre;
        catalogo=new CatalogoMedicamento();
        c=new Consulta(new Date(),d);
    }
    public void ingresarTratamiento(String id, Date fecha_inicio, Date fecha_termino){
        Diagnostico dg=c.diagnostico();
        dg.addTratamiento(new Tratamiento(fecha_inicio,fecha_termino,id));
    }
    public void ingresarMedPrescrito(String id_med, String id_mp, int frecuencia, int dosis, String id_tr){
        Medicamento med=catalogo.encontrarMed(id_med);
        Diagnostico dg=c.diagnostico();
        Tratamiento tr=dg.getTratamiento(id_tr);
        tr.addPrescripcion(new MedicamentoPrescrito(med,frecuencia,dosis,id_mp));
    }
    public double consultarAdherenciaGlobal(Date fecha1, Date fecha2, int frecuencia, String id_tr, String id_mp){
        Diagnostico dg=c.diagnostico();
        Tratamiento tr=dg.getTratamiento(id_tr);
        return tr.calcPGlo(fecha1, fecha2, frecuencia);
    }
    public double consultarAdherenciaDetallada(int umbral, Date fecha1, Date fecha2, int frecuencia, String id_tr){
        Diagnostico dg=c.diagnostico();
        Tratamiento tr=dg.getTratamiento(id_tr);
        return tr.calcPDet(umbral, fecha1, fecha2, frecuencia);
    }
}
