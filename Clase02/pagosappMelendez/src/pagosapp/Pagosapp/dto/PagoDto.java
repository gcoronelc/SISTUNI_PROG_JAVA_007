/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagosapp.Pagosapp.dto;

/**
 *
 * @author Alumno
 */
public class PagoDto {
    //Datos
    private int horasDia;
    private int dias;
    private double pagohora;
    //Resultados
    private double ingresos;
    private double renta;
    private double neto;
    
    // Constructor

    public PagoDto() {
    }
    
    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPagohora() {
        return pagohora;
    }

    public void setPagohora(double pagohora) {
        this.pagohora = pagohora;
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

    @Override
    protected void finalize() throws Throwable {
        System.err.println("chau objeto");
    }
    
   
}
