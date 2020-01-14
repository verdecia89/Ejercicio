/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonready;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class EjercicioOnready implements IVehiculo {

    List<Vehiculo> lis = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjercicioOnready listaVehiculo = new EjercicioOnready();

        listaVehiculo.lis.add(new Autos("Peugeot", "206", 4, 200000.00));
        listaVehiculo.lis.add(new Motos("Honda", "Titan", "125c", 60000.00));
        listaVehiculo.lis.add(new Autos("Peugeot", "208", 5, 250000.00));
        listaVehiculo.lis.add(new Motos("Yamaha", "YBR", "160c", 80500.50));
        listaVehiculo.imprimirLista();
        System.out.println("==============================================");
        listaVehiculo.masCaro();
        listaVehiculo.masBarato();
        listaVehiculo.contieneLetra("Y");
        System.out.println("==============================================");
    }

    public void imprimirLista() {
        for (Vehiculo obj : lis) {
            System.out.println(obj.toString());
        }
    }

    @Override
    public void masCaro() {
        Vehiculo objTmp = null;
        for (Vehiculo obj : lis) {
            if (objTmp == null) {
                objTmp = obj;
                continue;
            }
            if (objTmp.getPrecio() < obj.getPrecio()) {
                objTmp = obj;
            }
        }
        System.out.println("Vehículo más caro: " + objTmp.getMarca() + " " + objTmp.getModelo());
    }

    @Override
    public void masBarato() {
        Vehiculo objTmp = null;
        for (Vehiculo obj : lis) {
            if (objTmp == null) {
                objTmp = obj;
                continue;
            }
            if (objTmp.getPrecio() > obj.getPrecio()) {
                objTmp = obj;
            }
        }
        System.out.println("Vehículo más barato: " + objTmp.getMarca() + " " + objTmp.getModelo());
    }

    @Override
    public void contieneLetra(String c) {
        for (Vehiculo obj : lis) {
            if (obj.getModelo().contains(c)) {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + obj.getMarca() + " " + obj.getModelo() + " $" + obj.precio);
                break;
            }
        }
    }
}
