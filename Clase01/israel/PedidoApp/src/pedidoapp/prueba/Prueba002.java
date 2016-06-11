package pedidoapp.prueba;

import javax.swing.*;

import pedidoapp.service.PedidoService2;

public class Prueba002 {
    
    public static void main(String[] args) {
    
        int k[] = new int[3];
    
        PedidoService2 ejercicio = new PedidoService2(); 
        
         k[0] = Integer.parseInt(JOptionPane.showInputDialog("ingresa primer numero"));
         k[1] = Integer.parseInt(JOptionPane.showInputDialog("ingresa segundo numero"));
         k[2] = Integer.parseInt(JOptionPane.showInputDialog("ingresa tercer numero"));

         int x = ejercicio.promedio(k[0],k[1],k[2]);
         
         
        System.out.println("El promedio es " +x);
        ejercicio.numeromayor(k[0], k[1], k[2]);
    }
}
