package Clases;
import java.util.*;

public class Operador {
    private ArrayList<Paciente> listaPacientes;
    public Operador(){
        listaPacientes=new ArrayList();
    }
    public void crearPaciente(String rut, String nombre, boolean sexo, int edad,  String direccion, String telefono){
        Paciente p=new Paciente(rut,nombre,sexo,edad,direccion,telefono);
        listaPacientes.add(p);
    }
    public List<Paciente> getPacientes(){
        return Collections.unmodifiableList(listaPacientes);
    }
}
