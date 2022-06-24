/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    public ReporteEstudiante(String c) {
        super(c);
    }

    public void establecerPromedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas += lista.get(i).getMatricula();

        }
        promedioMatriculas = promedioMatriculas / lista.size();

    }

    public void establecerLista(ArrayList<Estudiante> lis) {
        lista = lis;

    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;

    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;

    }

    @Override
    public String toString() {

        String cadena = String.format("Lista Estudiantes\n\n");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        cadena = String.format("\n%s\nPromedio Matriculas: %.2f\n", cadena,obtenerPromedioMatriculas());
        return cadena;
    }
}
