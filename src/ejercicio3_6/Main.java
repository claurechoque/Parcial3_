package ejercicio3_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda("Tienda Cuantica", "Juana la Cubana", 451238, 5);
        Computador comp1 = new Computador("Acer", 50, "intel iCore7", "Windows", 18500000);
        Computador comp2 = new Computador("Toshiba", 80, "Intel iCore5", "Windows", 15500000);
        Computador comp3 = new Computador("Mac", 100, "Intel i Core7", "Mac", 2500000);
        tienda.anadir(comp1);
        tienda.anadir(comp2);
        tienda.anadir(comp3);
        System.out.println("ingrese el nombre de la pc a buscar:");
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        System.out.println("El computador a buscar: " + marca + " Se encuentra en la posicion " + tienda.buscar(marca));
        tienda.imprimir();
        System.out.println("...................");

    }
}
