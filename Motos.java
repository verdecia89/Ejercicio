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
public class Motos extends Vehiculo {

    public String cilindrada;

    public Motos() {
    }

    public Motos(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
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

    @Override
    public String toString() {
        return "Marca: " + this.marca + " //" + " Modelo: " + this.modelo + " //" + " Cilindrada: " + this.cilindrada + " //" + " Precio: $" + this.precio;
    }

    
}
