package pe.egcc.dto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class ProductoDto {
  
  private String nombre;
  private double precio;
  private int stock;

  public ProductoDto() {
    System.out.println("Hola Java.");
  }

  public ProductoDto(String nombre, double precio, int stock) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau Objeto");
  }
  
}
