package pe.egcc.prueba;

import pe.egcc.dto.ProductoDto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    ProductoDto dto = new ProductoDto();
    
    mostrar(dto);
    
    dto.setNombre("Televisor");
    dto.setPrecio(3570.0);
    dto.setStock(300);
    
    mostrar(dto);
    
    
    dto = new ProductoDto("Coca Cola", 3.50, 100);
    mostrar(dto);
    
  }

  private static void mostrar(ProductoDto dto) {
    System.out.println("-----------------------------");
    System.out.println("Nombre: " + dto.getNombre());
    System.out.println("Precio: " + dto.getPrecio());
    System.out.println("Stock: " + dto.getStock());
  }
  
  
}
