/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeloparcial;

import Sistema.Sistema;
import model.Producto;
import model.Servicio;

/**
 *
 * @author lauti
 */
public class ModeloParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            System.out.println("Test 1.1:");
            //Servicio servicioMantenimiento1 = new Servicio("897323", "Mantenimiento de máquina de cortar pasto", 2500.0, 15.0, true);
            
            
            System.out.println("Test 1.2:");
            Servicio servicioMantenimiento2 = new Servicio("8973231", "Mantenimiento de máquina de cortar pasto", 2500.0, 15.0, true);
            System.out.println(servicioMantenimiento2);
            
            
            System.out.println("Test 1.3:");
            //Producto productoManguera1 = new Producto("432597", "Manguera de desagote lavarropa", 650.0, 15.0, true);
            
            
            System.out.println("Test 1.4:");
            Producto productoManguera2 = new Producto("4325971", "Manguera de desagote lavarropa", 650.0, 15.0, true);
            System.out.println(productoManguera2);
            
            
            System.out.println("Test 2.1:");
            System.out.println(servicioMantenimiento2.calcularPrecioFinal());
            
            
            System.out.println("Test 2.2:");
            System.out.println(productoManguera2.calcularPrecioFinal());
            
            
            System.out.println("Test 3.1:");
            Sistema sistema1 = new Sistema();
            System.out.println(sistema1.agregarProducto("3892871", "Aceite para máquinas", 430.0, 10.0, true));
            System.out.println(sistema1.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0, 0.0, true));
            System.out.println(sistema1.agregarProducto("9381925", "Tambor lavarropa", 7500.0, 25.0, false));
            System.out.println(sistema1.agregarServicio("3481759", "Mantenimiento estufa", 1250.0, 0.0, true));

            
            System.out.println("Test 3.2:");
            //sistema1.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0, 0, true);
            
            System.out.println("Test 3.3:");
            //sistema1.agregarProducto("9381925", "Tambor lavarropa", 7500.0, 25.0, false);
            
            
            System.out.println("Test 4:");
            System.out.println(sistema1.getLstMercancia());
            System.out.println(sistema1.traerMercancia(true));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
