package pedidoapp.prueba;

import pedidoapp.service.PedidoService;

public class Prueba001 {
    
    public static void main(String[] args) {
        
        double importe = 4567.34;
        
        PedidoService service = new PedidoService();
        
        double impuesto = service.calcImpuesto(importe);
        double total = service.calcTotal(importe);
        
        System.out.println("importe " +importe);
        System.out.println("impuesto " +impuesto);
        System.out.println("tota l" +total);

        
    }
    
}
