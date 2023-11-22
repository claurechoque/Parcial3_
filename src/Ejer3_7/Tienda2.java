package Ejer3_7;

import Ejer3_6.Computador;

import java.util.Vector;

public class Tienda2 {
    String nombre, propietario;
    int identificadorTrib;

    Vector computadores;

    public Tienda2(String nombre, String propietario, int identificadorTrib) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTrib = identificadorTrib;
        computadores = new Vector();
    }
    public boolean tiendaLlena(){
        return false;
    }

    public boolean tiendaVacio(){
        return computadores.size()==0;
    }

    public void anadir(Computadora computadora){
        computadores.add(computadora);
    }

    public boolean eliminar(String marcaComputadora){
        int pos= buscar(marcaComputadora);
if (pos<0){
    return false;
}
computadores.removeElement(pos);
    return true;
    }

    public int buscar(String marcaComputadora){
        Computadora computador;
        for (int i=0;i< computadores.size();i++){
            computador= (Computadora) computadores.elementAt(i);
            if (computador.marca.equals(marcaComputadora))
                return i;
        }
        System.out.println("Esa marca no existe");
        return -1;
    }
public void imprimir(){
        for (int i=0;i< computadores.size();i++){
            System.out.println("Computador "+i);
            Computadora computador =(Computadora) computadores.elementAt(i);
            System.out.println("Marca: "+computador.marca);
            System.out.println("Cantidad de memoria: "+ computador.cantidadMemoria);
            System.out.println("Caracteristicas del procesador: "+ computador.caracteristicasProcesador);
            System.out.println("Sistema operativo: "+ computador.sistemaOperativo);
            System.out.println("Precio: "+computador.precio);

        }
}
}
