package ejercicio3_7;

public class Computadora {
    String marca,caracteristicasProcesador,sistemaOperativo;
    int cantidadMemoria;
    double precio;

    public Computadora(String marca, String caracteristicasProcesador, String sistemaOperativo, int cantidadMemoria, double precio) {
        this.marca = marca;
        this.caracteristicasProcesador = caracteristicasProcesador;
        this.sistemaOperativo = sistemaOperativo;
        this.cantidadMemoria = cantidadMemoria;
        this.precio = precio;
    }
}
