package Ejer3_6;

public class Estudiantes {
        private String nombre;
        private String apellidos;
        private int codigo;
        private int semestre;
        private double notaFinal;

        // Constructor
        public Estudiantes (String nombre, String apellidos, int codigo, int semestre, double notaFinal) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.codigo = codigo;
            this.semestre = semestre;
            this.notaFinal = notaFinal;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
