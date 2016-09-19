/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Date;

/**
 *
 * @author horac
 */
public class Evento extends Actividad{
    private int horaInicio;
    private int horaFinalizacion;

    public Evento(int horaInicio, int horaFinalizacion, Date fecha, String titulo, int recordatorio, boolean recordarme, User usuarioDueno) {
        super(fecha, titulo, recordatorio, recordarme, usuarioDueno);
        this.horaInicio = horaInicio;
        this.horaFinalizacion = horaFinalizacion;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(int horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    @Override
    public String toString() {
        return "Evento{" + "horaInicio=" + horaInicio + ", horaFinalizacion=" + horaFinalizacion + '}';
    }
    
}
