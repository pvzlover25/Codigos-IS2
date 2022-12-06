package Clases;
import java.util.HashMap;

public class CatalogoMedicamento {
    private HashMap<String,Medicamento> medicamentos;
    public CatalogoMedicamento(){
        medicamentos=new HashMap();
    }
    public void addMedicamento(Medicamento m){
        medicamentos.put(m.id(),m);
    }
    public Medicamento encontrarMed(String id_med){
        return medicamentos.get(id_med);
    }
}
