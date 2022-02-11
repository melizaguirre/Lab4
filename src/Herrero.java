/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Herrero extends Aldeanos{
    private Utensilios utensilios = new Utensilios();

     public Herrero(String nombre, String apellido, int edad, int vida, String rango) {
        super(nombre, apellido, edad, vida, rango);
     }
    
    public Herrero(String ataqueNombre, String nombre, String apellido, int edad, int vida, String rango) {
        super(nombre, apellido, edad, vida, rango);
        this.utensilios.setAtaqueNombre(nombre);
    }

    public Utensilios getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(Utensilios utensilios) {
        this.utensilios = utensilios;
    }

    @Override
    public String toString() {
        return "Herrero{" + super.toString()+ "utensilios=" + utensilios + '}';
    }
     
     
    public int Dano(Aldeanos atacar){
       if (atacar instanceof Agronomo) return (int)Math.round(Utensilios.getDano*0.01);
  
        if (atacar instanceof Pacifista) return (int)Math.round(Utensilios.getDano*0.05);
               return Utensilios.getDano;        
    }
    
    
    
    
}
