package Ejer4_1;

public class Main2 {
            public static void main(String[] args) {
            Libro libro = new Libro("El Gran Gatsby", "Scott Fitzgerald", 25.99);
            libro.imprimirInformacion();

            LibroDeTexto libroDeTexto = new LibroDeTexto("Algebra", "Baldor", 49.99, "Matemáticas 101");
            libroDeTexto.imprimirInformacion();

           LibroTextoUni libroTextoUni = new LibroTextoUni("Biologia", "Juanita la sucia", 69.69, "Biologia 200", "Facultad de Ciencias Humanas");
            libroTextoUni.imprimirInformacion();

            Novela novela = new Novela("Cien Años de Soledad", "Manuela Pajares", 15.99, "Realista");
            novela.imprimirInformacion();
        }
    }
