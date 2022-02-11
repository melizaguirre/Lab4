/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Normales extends Aldeanos{
    
    private PunoLimpio ataque = new PunoLimpio();
    
    public Normales (String nombre, String apellido, int edad, int vida, String rango){
        super (nombre, apellido, edad, vida, rango);
        
    }
     public Normales (String ataqueNombre, String nombre, String apellido, int edad, int vida, String rango){
        super (nombre, apellido, edad, vida, rango);
        this.ataque.setAtaqueNombre(ataqueNombre);
        
    }

    public PunoLimpio getAtaque() {
        return ataque;
    }

    public void setAtaque(PunoLimpio ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Normales{" + super.toString() + "ataque=" + ataque + '}';
    }
     
    public int Dano(Aldeanos atacar){
      if (atacar instanceof Pacifista) return (int)Math.roud(punolimpio.getDano()*0.05);
      return punolimpio.getDano();
    }
    
    
}
