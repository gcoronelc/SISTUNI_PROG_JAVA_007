package pedidosapp.prueba;

import pedidosapp.service.PedidoService;

public class Prueba01 {
    public static void main(String[] args) {
        double importe = 4567.34; //dato
        //proceso
        PedidoService service = new PedidoService();
        double impuesto = service.calcImpuesto(importe);
        double total = service.calcTotal(importe);
        //reporte
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
        
        
        
    }
    
}
