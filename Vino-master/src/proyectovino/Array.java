/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovino;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author RichiThe
 */
public class Array
{
    ArrayList<Vino> vin = new ArrayList<>();
    
    public void agregarVino(Vino obj)
    {
     boolean a = false;   
     if(vin.isEmpty())
     {
       vin.add(obj);
     } 
     else
     {
         for (Vino vins : vin)
         {
             if(vins.getCodVino().equals(obj.getCodVino()))
             {
               a = true;
               break;
             }
         }
         if(!a)
         {
           vin.add(obj);
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Codigo ya existe");
         }
     }
      
    
    }
    
    public ArrayList<Vino> listaVino()
    {
      return this.vin;
    }
    
    public void eliminar(String i)
    {
      Vino out = null;
        for(Vino a : vin)
        {
            if(a.getCodVino().equals(i))
            {
                System.out.println("asd");
               out = a;
            }
        }
        vin.remove(out);
    }
}
