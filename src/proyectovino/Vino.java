/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovino;

/**
 *
 * @author RichiThe
 */
public class Vino 
{
   private int codVino;
   private String nombreVino;
   private String tipoVino;
   private Cepa cep;
   private Suelo sue;
   private Barrica bar;

    public Vino() {
    }

    public Vino(int codVino, String nombreVino, String tipoVino, Cepa cep, Suelo sue, Barrica bar) {
        this.codVino = codVino;
        this.nombreVino = nombreVino;
        this.tipoVino = tipoVino;
        this.cep = cep;
        this.sue = sue;
        this.bar = bar;
    }

    public int getCodVino() {
        return codVino;
    }

    public void setCodVino(int codVino) {
        this.codVino = codVino;
    }

    public String getNombreVino() {
        return nombreVino;
    }

    public void setNombreVino(String nombreVino) {
        this.nombreVino = nombreVino;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public Cepa getCep() {
        return cep;
    }

    public void setCep(Cepa cep) {
        this.cep = cep;
    }

    public Suelo getSue() {
        return sue;
    }

    public void setSue(Suelo sue) {
        this.sue = sue;
    }

    public Barrica getBar() {
        return bar;
    }

    public void setBar(Barrica bar) {
        this.bar = bar;
    }

    
    
    
    
}
