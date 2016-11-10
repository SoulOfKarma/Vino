/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovino;
import java.util.ArrayList;
/**
 *
 * @author RichiThe
 */
public class Array
{
    ArrayList<Vino> vin = new ArrayList<>();
    
    public void agregarVino(Vino obj)
    {
      vin.add(obj);
    
    }
    
    public ArrayList<Vino> listaVino()
    {
      return this.vin;
    }
}
