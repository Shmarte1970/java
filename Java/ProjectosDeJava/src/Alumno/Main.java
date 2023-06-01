/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Insertar un nuevo alumno");
            System.out.println("2. Eliminar un alumno");
            System.out.println("3. Modificar los datos de un alumno");
            System.out.println("4. Mostrar todos los alumnos almacenados");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del alumno: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después de leer el número
                    Alumno nuevoAlumno = new Alumno(nombre, edad);
                    listaAlumnos.add(nuevoAlumno);
                    System.out.println("Alumno insertado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del alumno a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    Iterator<Alumno> iterator = listaAlumnos.iterator();
                    boolean encontrado = false;
                    while (iterator.hasNext()) {
                        Alumno alumno = iterator.next();
                        if (alumno.getNombre().equals(nombreEliminar)) {
                            iterator.remove();
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Alumno eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró el alumno.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del alumno a modificar: ");
                    String nombreModificar = scanner.nextLine();
                    encontrado = false;
                    for (Alumno alumno : listaAlumnos) {
                        if (alumno.getNombre().equals(nombreModificar)) {
                            System.out.print("Ingrese el nuevo nombre del alumno: ");
                            String nuevoNombre = scanner.nextLine();
                            System.out.print("Ingrese la nueva edad del alumno: ");
                            int nuevaEdad = scanner.nextInt();
                            scanner.nextLine(); // Consumir el salto de línea después de leer el número
                            alumno.setNombre(nuevoNombre);
                            alumno.setEdad(nuevaEdad);
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Datos del alumno modificados correctamente.");
                    } else {
                        System.out.println("No se encontró el alumno.");
                    }
                    break;
                case 4:
                     System.out.println("Alumnos almacenados:");
                    for (Alumno alumno : listaAlumnos) {
                        System.out.println("Nombre: " + alumno.getNombre() + ", Edad: " + alumno.getEdad());
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }
}

