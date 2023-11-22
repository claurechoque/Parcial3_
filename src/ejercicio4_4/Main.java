package ejercicio4_4;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Profesor profe1 = new ProfesorTitular();
        profe1.imprimir();
        ((ProfesorTitular) profe1).imprimirAnos();
        System.out.println("------------------");
        Prueba prueba = new Prueba();
        prueba.profesores = new Vector();
        Profesor profesor1 = new Profesor();
        ProfesorTitular profesor2 = new ProfesorTitular();
        prueba.profesores.add(profesor1);
        prueba.profesores.add(profesor2);
        for(int i = 0; i < prueba.profesores.size(); i++) {
            Profesor p = (Profesor) prueba.profesores.elementAt(i);
            p.imprimir();
        }
    }
}
