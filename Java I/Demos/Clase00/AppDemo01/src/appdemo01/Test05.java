package appdemo01;

public class Test05 {

    public static void main(String[] args) {
        // for 
        int su = 0;
        for (int i = 0; i <= 10; i++) {
            su += i; //su=su+i
        }
        System.out.println("La suma es " + su);

        //while
        int i = 1;//contador
        while (i <= 50) {
            su += i; //su es acumulador
            i++; //i=i+1
        }
        System.out.println("La suma es " + su);
    }

}
