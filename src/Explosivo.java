/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Explosivo extends Aldeanos {
     private InclusoFamilia ataque = new InclusoFamilia();
 
    public Explosivo(String nombre, String apellido, int edad, int vida, String rango) {
        super(nombre, apellido, edad, vida, rango);
    }
    
    public Explosivo(String ataqueNombre, String nombre, String apellido, int edad, int vida, String rango) {
        super(nombre, apellido, edad, vida, rango);
        this.ataque.setAtaqueNombre(ataqueNombre);
    }

    public InclusoFamilia getAtaque() {
        return ataque;
    }

    public void setAtaque(InclusoFamilia ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Explosivo{" + super.toString()+ "ataque=" + ataque + '}';
    }
     
     public int Dano(Aldeanos atacar){
       if (atacar instanceof Herrero) return (int)Math.round(Utensilios.getDano*0.05);
  
        if (atacar instanceof Agronomo) return (int)Math.round(Utensilios.getDano*0.01);
               return Utensilios.getDano;        
    }
    
    
    
}
