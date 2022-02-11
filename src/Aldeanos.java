/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public abstract class Aldeanos {
    private String nombre;
    private String apellido;
    private int edad;
    private int vida;
    private String rango;

    public Aldeanos(String nombre, String apellido, int edad, int vida, String rango) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Aldenanos{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", vida=" + vida + ", rango=" + rango + '}';
    }
    
    public int daño(){
        return 0;
    }
    

    
    
    
}
