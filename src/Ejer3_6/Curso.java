package Ejer3_6;

import java.util.Scanner;

public class Curso {
    Estudiantes [] estudiantes;
    int cantidadEstudiantes;
    private double[][] notasPorSemestre; // Matriz para almacenar las notas por semestre

    static final int MAX_ESTUDIANTES = 100; // Define el máximo de estudiantes permitidos

    public Curso() {
        estudiantes = new Estudiantes[MAX_ESTUDIANTES];
        notasPorSemestre = new double[MAX_ESTUDIANTES][6]; // 6 semestres
        cantidadEstudiantes = 0;
    }

    // Metodo agregar estudiante
    public void agregarEstudiante() {
      Scanner sc = new Scanner(System.in);

        if (cantidadEstudiantes < MAX_ESTUDIANTES) {
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = sc.nextLine();

            System.out.println("Ingrese los apellidos del estudiante:");
            String apellidos = sc.nextLine();

            System.out.println("Ingrese el codigo del estudiante:");
            int codigo = sc.nextInt();

            if (codigoExistente(codigo)) {
                System.out.println("El codigo del estudiante ya existe. No se pudo agregar al curso.");
                return;
            }

            System.out.println("Ingrese el numero de semestre del estudiante:");
            int semestre = sc.nextInt();
            if (semestre < 1 || semestre > 6) {
                System.out.println("El numero de semestre no es válido. Debe estar entre 1 y 6.");
                return;
            }
            System.out.println("Ingrese la nota final del estudiante:");
            double notaFinal = sc.nextDouble();

            estudiantes[cantidadEstudiantes] = new Estudiantes(nombre, apellidos, codigo, semestre, notaFinal);
            notasPorSemestre[cantidadEstudiantes][semestre - 1] = notaFinal;
            cantidadEstudiantes++;

            System.out.println("Estudiante agregado exitosamente.");
        } else {
            System.out.println("El curso esta completo. No se pueden agregar mas estudiantes.");
        }
    }

    // codigo unico de los estudiantes
    boolean codigoExistente(int codigo) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }
// buscador
    public void buscarEstudiantePorCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del estudiante a buscar:");
        int codigoBuscado = sc.nextInt();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigoBuscado) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].getNombre());
                System.out.println("Apellidos: " + estudiantes[i].getApellidos());
                System.out.println("Codigo: " + estudiantes[i].getCodigo());
                System.out.println("Numero de semestre: " + estudiantes[i].getSemestre());
                System.out.println("Nota Final: " + estudiantes[i].getNotaFinal());
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }
    // eliminar estudiante
    public void eliminarEstudiantePorCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del estudiante a eliminar:");
        int codigoEliminar = sc.nextInt();
        int indiceEliminar = -1;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigoEliminar) {
                indiceEliminar = i;
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].getNombre());
                System.out.println("Apellidos: " + estudiantes[i].getApellidos());
                System.out.println("Codigo: " + estudiantes[i].getCodigo());
                System.out.println("Numero de semestre: " + estudiantes[i].getSemestre());
                System.out.println("Nota Final: " + estudiantes[i].getNotaFinal());
                break;
            }
        }

        if (indiceEliminar != -1) {
            System.out.println("¿Esta seguro de eliminar este estudiante? (S/N)");
            String confirmacion = sc.next();
            if (confirmacion.equalsIgnoreCase("S")) {
                eliminarEstudiante(indiceEliminar);
                System.out.println("Estudiante eliminado exitosamente.");
            } else {
                System.out.println("Eliminación cancelada.");
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // eliminar un estudiante en una posicion específica
    void eliminarEstudiante(int indice) {
        for (int i = indice; i < cantidadEstudiantes - 1; i++) {
            estudiantes[i] = estudiantes[i + 1];
        }
        cantidadEstudiantes--;
    }

    // calcular el promedio del curso
    public double calcularPromedioPorSemestre() {
        for (int semestre = 1; semestre <= 6; semestre++) {
            double sumaNotas = 0;
            int cantidadEstudiantesEnSemestre = 0;

            for (int i = 0; i < cantidadEstudiantes; i++) {
                if (estudiantes[i].getSemestre() == semestre) {
                    sumaNotas += notasPorSemestre[i][semestre - 1];
                    cantidadEstudiantesEnSemestre++;
                }
            }
            if (cantidadEstudiantesEnSemestre > 0) {
                double promedio = sumaNotas / cantidadEstudiantesEnSemestre;
                System.out.println("Promedio del semestre " + semestre + ": " + promedio);
            } else {
                System.out.println("No hay estudiantes en el semestre " + semestre);
            }
        }
        return 0;
    }
    // cantidad de estudiantes que aprobaron el curso
    public int obtenerCantidadEstudiantesAprobados() {
        int cantidadAprobados = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getNotaFinal() >= 51) {
                cantidadAprobados++;
            }
        }
        return cantidadAprobados;
    }

    // calcular el porcentaje de estudiantes que aprobaron el curso
    public double calcularPorcentajeAprobados() {
        int aprobados = obtenerCantidadEstudiantesAprobados();
        if (cantidadEstudiantes > 0) {
            return (double) aprobados / cantidadEstudiantes * 100;
        } else {
            return 0;
        }
    }
// menu
public void mostrarMenu() {
    Scanner sc= new Scanner(System.in);

    while (true) {
        System.out.println("Menu:");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Buscar estudiante por codigo");
        System.out.println("3. Eliminar estudiante por codigo");
        System.out.println("4. Calcular promedio del curso");
        System.out.println("5. Obtener cantidad de estudiantes aprobados");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                agregarEstudiante();
                break;
            case 2:
                buscarEstudiantePorCodigo();
                break;
            case 3:
                eliminarEstudiantePorCodigo();
                break;
            case 4:
                double promedio = calcularPromedioPorSemestre();


                System.out.println("Promedio del curso: " + promedio);
                break;
            case 5:
                int cantidadAprobados = obtenerCantidadEstudiantesAprobados();
                double porcentajeAprobados = calcularPorcentajeAprobados();
                System.out.println("-----------------------------------------------------");
                System.out.println("Cantidad de estudiantes aprobados: " + cantidadAprobados);
                System.out.println("Porcentaje de estudiantes aprobados: " + porcentajeAprobados + "%");
                System.out.println("-----------------------------------------------------");
                break;
            case 6:
                System.out.println("Saliendo del programa.");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida. Intente de nuevo.");
        }
    }
}

}
