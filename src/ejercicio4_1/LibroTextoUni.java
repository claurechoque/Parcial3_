package ejercicio4_1;

public class LibroTextoUni extends LibroDeTexto{
    private String facultad;

    public LibroTextoUni (String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Facultad: " + facultad);
        System.out.println();
    }
}
