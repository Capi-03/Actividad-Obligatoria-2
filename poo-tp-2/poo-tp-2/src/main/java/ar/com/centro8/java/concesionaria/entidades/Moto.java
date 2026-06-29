package ar.com.centro8.java.concesionaria.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, Double precio, int  cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {

        return "Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Cilindrada: " + getCilindrada() + "c"
                + " // Precio: $" + formatearPrecio();

    }
  

}
