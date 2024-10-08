/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lauti
 */
public abstract class Mercancia {
    
    protected String codMercancia;

    public Mercancia(String codMercancia) throws Exception {
        if (codMercancia.length() == 7){
            this.codMercancia = codMercancia;
        }
        else{
            throw new Exception("El código debe tener 7 caracteres.");
        }
    }

    public String getCodMercancia() {
        return codMercancia;
    }

    public void setCodMercancia(String codMercancia) throws Exception{
        if (codMercancia.length() == 7){
            this.codMercancia = codMercancia;
        }
        else{
            throw new Exception("El código debe tener 7 caracteres.");
        }
    }
    
    public abstract double calcularPrecioFinal();
    
    
}
