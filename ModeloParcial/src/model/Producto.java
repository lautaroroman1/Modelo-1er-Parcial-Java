/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lauti
 */
public class Producto extends Mercancia {
    private String producto;
    private double precioProducto;
    private double porcentajeDescuento;
    private boolean esDescuentoEn2daUnidad;

    public Producto(String codMercancia, String producto, double precioProducto, double porcentajeDesceunto, boolean esDescuentoEn2daUnidad) throws Exception{
        super(codMercancia);
        this.producto = producto;
        this.precioProducto = precioProducto;
        this.porcentajeDescuento = porcentajeDesceunto;
        this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getPorcentajeDesceunto() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDesceunto(double porcentajeDesceunto) {
        this.porcentajeDescuento = porcentajeDesceunto;
    }

    public boolean isEsDescuentoEn2daUnidad() {
        return esDescuentoEn2daUnidad;
    }

    public void setEsDescuentoEn2daUnidad(boolean esDescuentoEn2daUnidad) {
        this.esDescuentoEn2daUnidad = esDescuentoEn2daUnidad;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = precioProducto;
        if (esDescuentoEn2daUnidad == true){
            precioFinal = precioProducto - (precioProducto * (porcentajeDescuento / 100 / 2));
        }
        
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Producto{" + "producto=" + producto + ", precioProducto=" + precioProducto + ", porcentajeDescuento=" + porcentajeDescuento + ", esDescuentoEn2daUnidad=" + esDescuentoEn2daUnidad + '}';
    }

    
    
    
}
