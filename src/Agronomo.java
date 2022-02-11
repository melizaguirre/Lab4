/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Agronomo extends Aldeanos{
    private Rastrillo ataque = new Rastrillo();

    public Agronomo(String nombre, String apellido, int edad, int vida, String rango) {
        super(nombre, apellido, edad, vida, rango);
    }
     public Agronomo(String ataqueNombre, String nombre, String apellido, int edad, int vida, String rango) {
        super(nombre, apellido, edad, vida, rango);
        this.ataque.setAtaqueNombre(ataqueNombre);
    }

    public Rastrillo getAtaque() {
        return ataque;
    }

    public void setAtaque(Rastrillo ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Agronomo{" + super.toString()+ "ataque=" + ataque + '}';
    }
     
    public int daño(){
        return 0;
    }
    
    
    
    
}
