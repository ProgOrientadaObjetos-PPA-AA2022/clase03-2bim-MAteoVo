/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String c) {
        super(c);
    }

    public void establecerLista(ArrayList<Policia> lis) {
        lista = lis;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public void calcularPromedioEdades() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades += lista.get(i).getEdad();
        }
        promedioEdades = promedioEdades / lista.size();
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public String toString() {
        String cadena = String.format("Lista Policias\n\n");
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio de edades: %.2f\n", cadena, promedioEdades);
        return cadena;
    }
}
