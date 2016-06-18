package pe.egcc.pagoApp.dto;

/**
 *
 * @author Alumno
 */
public class PagoDto {

    //Datos

    private int horasDias;
    private int dias;
    private double pagoHora;

    // Resulatdo
    
    private double ingresos;
    private double renta;
    private double neto;

    public PagoDto() {
    }

    
    public int getHorasDias() {
        return horasDias;
    }

    public void setHorasDias(int horasDias) {
        this.horasDias = horasDias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    
    
}
