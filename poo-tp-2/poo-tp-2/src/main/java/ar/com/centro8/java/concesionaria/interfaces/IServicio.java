package ar.com.centro8.java.concesionaria.interfaces;

import ar.com.centro8.java.concesionaria.entidades.Vehiculo;

public interface IServicio {

    Vehiculo[] cargarVehiculos();

    Vehiculo buscarMasCaro(Vehiculo[] vehiculos);
    Vehiculo buscarMasBarato(Vehiculo[] vehiculos);
    Vehiculo buscarPorLetraEnModelo(Vehiculo[] vehiculos, char letra);

    void ordenarPorPrecioDescendente(Vehiculo[] vehiculos);
    void ordenarPorOrdenNatural(Vehiculo[] vehiculos);

    void generarReporte(Vehiculo[] vehiculos);

}
