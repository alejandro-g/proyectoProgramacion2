/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author horac
 */
public class Tarea extends Actividad{
    private String contenido;
    private ArrayList<String> notas;

    public Tarea(String contenido, ArrayList<String> notas, Date fecha, String titulo, int recordatorio, boolean recordarme, User usuarioDueno) {
        super(fecha, titulo, recordatorio, recordarme, usuarioDueno);
        this.contenido = contenido;
        this.notas = notas;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Tarea{" + "contenido=" + contenido + ", notas=" + notas + '}';
    }
    
    
}
