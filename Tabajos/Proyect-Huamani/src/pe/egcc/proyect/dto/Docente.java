package pe.egcc.proyect.dto;

public class Docente extends Persona{
    
    public Docente(String codigo, String nombre, double sueldoxhora,int nhoras ){
        super(codigo, nombre, sueldoxhora*nhoras);
    } 
    
    @Override
    public String MostrarDatos() {
        return "PROFESOR\n" + super.MostrarDatos();
    }

}
