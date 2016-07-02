package pe.egcc.proyect.dto;

public class Persona {
    
        private String codigo;
        private String nombre;
        private double sueldo;
    
        public Persona(String codigo, String nombre, double sueldo) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.sueldo = sueldo;
        }

        public String MostrarDatos() {
            return "Codigo :" + codigo + "\nNombre :" + nombre + "\nSueldo :" + sueldo;
        }
}


