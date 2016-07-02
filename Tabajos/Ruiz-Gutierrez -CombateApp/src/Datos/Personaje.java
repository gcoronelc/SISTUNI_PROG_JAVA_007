

package Datos;

import java.util.Random;

/**
 *
 * @author Aron
 */
public class Personaje {
    
   private String nombre;
   private int vida,energia,fuerza,agilidad,inteligencia;
   private Random rd = new Random(System.nanoTime());
    public Personaje() {
    }

    public Personaje(String nombre, int vida, int energia, int fuerza, int agilidad, int inteligencia) {
        this.nombre = nombre;
        this.vida = vida;
        this.energia = energia;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
   
   
   
    public int dañoAtaque(String nombre)
    {int random = rd.nextInt(3) ;
     int daño=0;
        if(this.nombre.equals("Orco"))
        {daño=(this.fuerza*3+this.agilidad*2)*random;
        }
        else if(nombre.equals("Humano"))
        {daño=(this.fuerza+this.agilidad*4)*random;}
        else if(nombre.equals("Mago"))
        {daño=(this.inteligencia*4+this.agilidad)*random;}
        else if(nombre.equals("Elfo"))
        {daño=(this.fuerza*2+this.agilidad*3+this.inteligencia)*random;}
 
    
    return daño;
    }
    public void dañoRecibido(int vida)
    { this.vida-=vida;
    
    }
     
}
