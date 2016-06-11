package pedidoapp.service;

public class PedidoService2 {
    
    public void numeromayor(int a, int b, int c)
    {
        int aux[] = new int[3];
        int mayor;
        
        aux[0] = a;
        aux[1] = b;
        aux[2] = c;
        
        for(int i = 1 ; i < 3 ; i++)
        {
            for(int j =0 ; j < 2 ; j++)
            {
                if(aux[j] > aux[j+1])
                {
                    mayor = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = mayor;
                }
            }
        }
        
        for(int i = 0 ; i < 3 ; i++)
        {
            System.out.println("secuencia" +aux[i]);
          

        }
        
    }
    
    public int promedio(int a, int b, int c)
    {
        int prom = (a + b +c)/3;
        
        return prom;
    }
    
    
    
}
