/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.util.ArrayList;
import java.util.List;
import model.Mercancia;
import model.Producto;
import model.Servicio;

/**
 *
 * @author lauti
 */
public class Sistema {

    private List<Mercancia> lstMercancia = new ArrayList();

    public Sistema() {
        lstMercancia = new ArrayList<Mercancia>();
    }

    public List<Mercancia> getLstMercancia() {
        return lstMercancia;
    }
    
    

    public Mercancia traerMercancia(String codMercancia) {
        for (Mercancia mercancia : lstMercancia) {
            if (mercancia.getCodMercancia().equals(codMercancia)) {
                return mercancia;
            }
        }

        return null;
    }

    public List<Mercancia> traerMercancia(boolean enOferta) {
        List<Mercancia> lstEnOferta = new ArrayList<>();

        for (Mercancia mercancia : lstMercancia) {

            if (mercancia instanceof Producto && ((Producto)mercancia).isEsDescuentoEn2daUnidad()) {
                lstEnOferta.add(mercancia);
            }

            if (mercancia instanceof Servicio && ((Servicio)mercancia).isEnPromocion()) {
                lstEnOferta.add(mercancia);
            }

        }

        return lstEnOferta;
    }

    public boolean agregarProducto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, boolean esDescuentoEn2daUnidad) throws Exception{
        for (Mercancia mercancia : lstMercancia) {
            if (mercancia.getCodMercancia().equals(codMercancia)) {
                throw new Exception("Ya existe un producto con ese código.");
            }
        }
        
        lstMercancia.add(new Producto(codMercancia, producto, precioProducto, porcentajeDescuento, esDescuentoEn2daUnidad));
        return true;
    }
    
    public boolean agregarServicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion) throws Exception{
        for (Mercancia mercancia : lstMercancia){
            if (mercancia.getCodMercancia().equals(codMercancia)){
                throw new Exception("Ya existe un servicio con ese código.");
            }
        }
        
        lstMercancia.add(new Servicio(codMercancia, servicio, presupuesto, porcentajeDescuento, enPromocion));
        return true;
    }
}
