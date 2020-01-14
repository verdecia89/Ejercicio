/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonready;

/**
 *
 * @author Miguel
 */
public class Autos extends Vehiculo {

    public int puertas = 0;

    public Autos() {
    }

    public Autos(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Marca: " + this.marca + " //" + " Modelo: " + this.modelo + " //" + " Puertas: " + this.puertas + " //" + " Precio: $" + this.precio;
    }

}
