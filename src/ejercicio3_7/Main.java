package ejercicio3_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tienda2 tienda = new Tienda2("Tienda Cuantica","Pepito",123456);
        Computadora computador1 = new Computadora("Acer","Intel iCore 7","Windows",50,18500000);
        Computadora computador2 = new Computadora("Toshiba","Intel iCore 5","Windows", 80,15500000);
        Computadora computador3 = new Computadora("Mac", "Intel iCore7","Mac",100,2500000);
        tienda.anadir(computador1);
        tienda.anadir(computador2);
        tienda.anadir(computador3);
        System.out.println("Ingrese la marca del computador que desea buscar");
        Scanner sc = new Scanner(System.in);
        String marca= sc.next();
        System.out.println("El computador a buscar: "+ marca+" se encuentra en la posicion: "+tienda.buscar(marca));
        tienda.imprimir();
    }
}
