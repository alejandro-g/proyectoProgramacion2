/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author horac
 */
public class Actividad implements Serializable{
    private Date fecha;
    private String titulo;
    private int recordatorio;
    private boolean recordarme;
    private User usuarioDueno;

    public Actividad(Date fecha, String titulo, int recordatorio, boolean recordarme, User usuarioDueno) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.recordatorio = recordatorio;
        this.recordarme = recordarme;
        this.usuarioDueno = usuarioDueno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(int recordatorio) {
        this.recordatorio = recordatorio;
    }

    public boolean isRecordarme() {
        return recordarme;
    }

    public void setRecordarme(boolean recordarme) {
        this.recordarme = recordarme;
    }

    public User getUsuarioDueno() {
        return usuarioDueno;
    }

    public void setUsuarioDueno(User usuarioDueno) {
        this.usuarioDueno = usuarioDueno;
    }

    @Override
    public String toString() {
        return "Actividad{" + "fecha=" + fecha + ", titulo=" + titulo + ", recordatorio=" + recordatorio + ", recordarme=" + recordarme + ", usuarioDueno=" + usuarioDueno + '}';
    }
    

}
