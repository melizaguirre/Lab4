/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class SuperGranjero extends Aldeanos{
    private AtaqueTodos ataque = new AtaqueTodos();

    public SuperGranjero(String nombre, String apellido, int edad, int vida, String rango) {
        super(nombre, apellido, edad, vida, rango);
    }
    
    public SuperGranjero(String ataqueNombre, String nombre, String apellido, int edad, int vida, String rango) {
        super(nombre, apellido, edad, vida, rango);
        this.ataque.setAtaqueNombre(ataqueNombre);
    }

    public AtaqueTodos getAtaque() {
        return ataque;
    }

    public void setAtaque(AtaqueTodos ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "SuperGranjero{" +super.toString() + "ataque=" + ataque + '}';
    }
     
    public int daño(){
        return 0;
    }
    
    
    
}
