package ar.com.centro8.java.concesionaria.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private Double precio;


    @Override
    public int compareTo(Vehiculo o) {
        int compararMarca = this.marca.compareTo(o.marca);
        if (compararMarca != 0) return compararMarca;
        
        int compararModelo = this.modelo.compareTo(o.modelo);
        if (compararModelo != 0) return compararModelo;
        
        return this.precio.compareTo(o.precio);
    }

    public String formatearPrecio() {
        return String.format("%,.2f", precio);
    }
    
}
