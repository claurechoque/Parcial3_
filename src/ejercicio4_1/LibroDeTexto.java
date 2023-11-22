package ejercicio4_1;

public class LibroDeTexto extends Libro{
    private String curso;

    public LibroDeTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
        System.out.println();
    }

}
