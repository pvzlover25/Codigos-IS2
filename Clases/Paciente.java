package Clases;
import java.util.*;

public class Paciente {
    private String rut,nombre,direccion,telefono;
    private boolean sexo; //true para masculino, false para femenino
    private int edad;
    public Paciente(String rut, String nombre, String direccion, String telefono, boolean sexo, int edad){
        this.rut=rut;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.sexo=sexo;
        this.edad=edad;
        consultas=new ArrayList();
    }
    public String getSexo(){
        if(sexo) return "Masculino";
        return "Femenino";
    }
    public String getRut(){
        return rut;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public int getEdad(){
        return edad;
    }
}
