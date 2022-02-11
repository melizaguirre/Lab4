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
    private int dano;
    
    public Ataque(){}
    
    public Ataque (int dano){
        this.dano= dano;
    }

    public Ataque(String ataqueNombre, int dano) {
        this.ataqueNombre = ataqueNombre;
        this.dano = dano;
    }

    public String getAtaqueNombre() {
        return ataqueNombre;
    }

    public void setAtaqueNombre(String ataqueNombre) {
        this.ataqueNombre = ataqueNombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Ataque{" + "ataqueNombre=" + ataqueNombre + ", Dano=" + dano + '}';
    }

   
}
