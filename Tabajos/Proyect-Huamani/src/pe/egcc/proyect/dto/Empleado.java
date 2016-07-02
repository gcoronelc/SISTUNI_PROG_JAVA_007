package pe.egcc.proyect.dto;

public class Empleado extends Persona{
    
    public Empleado(String codigo, String nombre, double sueldo,double bonificacion) {
        super(codigo, nombre, sueldo+bonificacion);
    } 
    // metodo
    @Override
    public String MostrarDatos() {
        return "EMPLEADO\n" + super.MostrarDatos();
    }
}
