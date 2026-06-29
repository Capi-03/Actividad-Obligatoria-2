package ar.com.centro8.java.concesionaria.tests;

import ar.com.centro8.java.concesionaria.entidades.Auto;
import ar.com.centro8.java.concesionaria.entidades.Moto;
import ar.com.centro8.java.concesionaria.entidades.Vehiculo;
import ar.com.centro8.java.concesionaria.interfaces.IServicio;

public class TestConcesionaria implements IServicio {

    private Vehiculo[] vehiculos;

    public static void main(String[] args) {

        TestConcesionaria concesionaria = new TestConcesionaria();

        Vehiculo[] vehiculos = concesionaria.cargarVehiculos();

        concesionaria.generarReporte(vehiculos);

    }

    @Override
    public Vehiculo[] cargarVehiculos() {

        vehiculos = new Vehiculo[4];

        vehiculos[0] = new Auto("Peugeot", "206", 200000.00, 4);
        vehiculos[1] = new Moto("Honda", "Titan", 60000.00, 125);
        vehiculos[2] = new Auto("Peugeot", "208", 250000.00, 5);
        vehiculos[3] = new Moto("Yamaha", "YBR", 80500.50, 160);

        return vehiculos;
    }

    @Override
    public Vehiculo buscarMasCaro(Vehiculo[] vehiculos) {

        Vehiculo mayor = vehiculos[0];

        for (int i = 1; i < vehiculos.length; i++) {

            if (vehiculos[i].getPrecio() > mayor.getPrecio()) {
                mayor = vehiculos[i];
            }

        }

        return mayor;
    }

    @Override
    public Vehiculo buscarMasBarato(Vehiculo[] vehiculos) {

        Vehiculo menor = vehiculos[0];

        for (int i = 1; i < vehiculos.length; i++) {

            if (vehiculos[i].getPrecio() < menor.getPrecio()) {
                menor = vehiculos[i];
            }

        }

        return menor;
    }

    @Override
    public Vehiculo buscarPorLetraEnModelo(Vehiculo[] vehiculos, char letra) {

        for (Vehiculo v : vehiculos) {

            if (v.getModelo().toUpperCase().contains(
                    String.valueOf(letra).toUpperCase())) {

                return v;
            }

        }

        return null;
    }

    @Override
    public void ordenarPorPrecioDescendente(Vehiculo[] vehiculos) {

        for (int i = 0; i < vehiculos.length - 1; i++) {

            for (int j = i + 1; j < vehiculos.length; j++) {

                if (vehiculos[i].getPrecio() < vehiculos[j].getPrecio()) {

                    Vehiculo aux = vehiculos[i];
                    vehiculos[i] = vehiculos[j];
                    vehiculos[j] = aux;

                }

            }

        }

    }

    @Override
    public void ordenarPorOrdenNatural(Vehiculo[] vehiculos) {

        for (int i = 0; i < vehiculos.length - 1; i++) {

            for (int j = i + 1; j < vehiculos.length; j++) {

                if (vehiculos[i].compareTo(vehiculos[j]) > 0) {

                    Vehiculo aux = vehiculos[i];
                    vehiculos[i] = vehiculos[j];
                    vehiculos[j] = aux;

                }

            }

        }

    }

    @Override
    public void generarReporte(Vehiculo[] vehiculos) {

        System.out.println("\n");

        // Imprime todos los vehículos
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

        System.out.println("\n=============================\n");

        Vehiculo caro = buscarMasCaro(vehiculos);
        Vehiculo barato = buscarMasBarato(vehiculos);
        Vehiculo letraY = buscarPorLetraEnModelo(vehiculos, 'Y');

        System.out.println("Vehículo más caro: "
                + caro.getMarca() + " " + caro.getModelo());

        System.out.println("Vehículo más barato: "
                + barato.getMarca() + " " + barato.getModelo());

        System.out.println("Vehículo que contiene en el modelo la letra 'Y': "
                + letraY.getMarca() + " "
                + letraY.getModelo()
                + " $ " + letraY.formatearPrecio());

        System.out.println("\n=============================\n");

        ordenarPorPrecioDescendente(vehiculos);

        System.out.println("Vehículos ordenados por precio de mayor a menor:");

        for (Vehiculo v : vehiculos) {
            System.out.println(v.getMarca() + " " + v.getModelo());
        }

        System.out.println("\n=============================\n");

        ordenarPorOrdenNatural(vehiculos);

        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");

        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

    }

}