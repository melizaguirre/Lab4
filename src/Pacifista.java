/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Pacifista extends Aldeanos{
    Ataque discursoPaz = new Ataque();

    public Pacifista(String nombre, String apellido, int edad, int vida, String rango) {
        super(nombre, apellido, edad, vida, rango);
        this.discursoPaz.setNombre(nombreAtaque);
    }
    
}
