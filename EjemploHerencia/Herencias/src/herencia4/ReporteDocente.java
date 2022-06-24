/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    public ReporteDocente(String c){
        super(c);
    }
    public void establecerLista(ArrayList<Docente> lis){
        lista = lis;
    }
    public ArrayList<Docente> obtenerLista(){
        return lista;
    }
    public void calcularPromedioSueldos(){
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos+=lista.get(i).getSueldo();
        }
        promedioSueldos = promedioSueldos/lista.size();
    }
    public double obtenerPromedioSueldos(){
        return promedioSueldos;
    }
    @Override
    public String toString(){
        String cadena = String.format("Lista de Docentes\n\n");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n",cadena,lista.get(i));
        }
        cadena = String.format("%s\nPromedio de Sueldos: %.2f",cadena,promedioSueldos);
        return cadena;
    }
}
