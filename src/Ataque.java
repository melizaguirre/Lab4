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
    private String ataqueNombre; 
    private int ataque;
    
    public Ataque(){}
    
    public Ataque (int ataque){
        this.ataque= ataque;
    }

    public Ataque(String ataqueNombre, int ataque) {
        this.ataqueNombre = ataqueNombre;
        this.ataque = ataque;
    }

    public String getAtaqueNombre() {
        return ataqueNombre;
    }

    public void setAtaqueNombre(String ataqueNombre) {
        this.ataqueNombre = ataqueNombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Ataque{" + "ataqueNombre=" + ataqueNombre + ", ataque=" + ataque + '}';
    }

   
}
