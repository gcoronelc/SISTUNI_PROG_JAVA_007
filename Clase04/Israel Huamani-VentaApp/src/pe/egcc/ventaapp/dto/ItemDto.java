package pe.egcc.ventaapp.dto;

    public class ItemDto {

    // atributos

    private String concepto;
    private double valor;
    //constructor

    public ItemDto(String concepto, double valor) {
        this.concepto = concepto;
        this.valor = valor;
    }
    // metodos get y set

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
