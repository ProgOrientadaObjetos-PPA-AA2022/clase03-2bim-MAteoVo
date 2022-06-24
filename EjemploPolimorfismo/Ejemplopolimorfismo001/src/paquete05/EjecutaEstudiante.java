
package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador=1;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        
        do {//Se utiliza un do while para que por lo menos una vez se ingrese un tipo de estudiante             
                        System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "Ingrese (2) para Estudiante Distancia");
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            if (tipoEstudiante == 1) {
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                estudiantes.add(estudianteP);//Se agrega al estudiante presencial con add ya que utilizamos un ArrayList
                
            } else {
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    estudiantes.add(estudianteD);//Se agrega al estudiante distancia con add ya que utilizamos un ArrayList
            }
            System.out.println("Desea Ingresar otro estudiante?? Si[1] No[0]:");
            contador = entrada.nextInt();//Si el usuario elige 0 se ejecutará la acción del while y saldra del ciclo 
        } while (contador!=0);
        
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
        for (int i = 0; i < estudiantes.size(); i++) {
                        System.out.printf("Datos Estudiante\n"
                        + "Nombres: %s\n"
                        + "Apellidos: %s\n"
                        + "Identificación: %s\n"
                        + "Edad: %d\n"
                        + "Costo Matricula: %.2f\n",
                  estudiantes.get(i).obtenerNombresEstudiante(),//se utiliza el get ya que trabajamos con un ArrayList
                  estudiantes.get(i).obtenerApellidoEstudiante(),
                  estudiantes.get(i).obtenerIdentificacionEstudiante(),
                  estudiantes.get(i).obtenerEdadEstudiante(),
                  estudiantes.get(i).obtenerMatricula());
        }
    }

}