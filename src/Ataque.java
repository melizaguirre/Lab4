/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Ataque {
    private String nombre; 
    private int ataque;
    
    public Ataque(){}
    
    public Ataque (int ataque){
        this.ataque= ataque;
    }

    public Ataque(String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAttaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Ataque{" + "nombre=" + nombre + ", Ataque=" + ataque + '}';
    }
    
    
    
}
