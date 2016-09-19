/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author horac
 */
public class hiloRecordatorio extends Thread{
    
    private boolean vive;
    private int recordatorio;
    private Date fecha;
    private String contenido;
    private int minutosARecordar;

    public hiloRecordatorio(boolean vive, int recordatorio, Date fecha, String contenido, int minutosARecordar) {
        this.vive = true;
        this.recordatorio = recordatorio;
        this.fecha = fecha;
        this.contenido = contenido;
        this.minutosARecordar = minutosARecordar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(int recordatorio) {
        this.recordatorio = recordatorio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getMinutosARecordar() {
        return minutosARecordar;
    }

    public void setMinutosARecordar(int minutosARecordar) {
        this.minutosARecordar = minutosARecordar;
    }
   
    
    
    @Override public void run(){
        int minutosPasados = 0;
        vive = true;
        while (vive){
            Date fechaActual = new Date();
            System.out.println(minutosARecordar);
            System.out.println(fecha.getMinutes() - recordatorio);
            fecha.setMinutes(minutosARecordar);
            if(fechaActual.getMinutes() + recordatorio == (fecha.getMinutes() - recordatorio) ){
                JOptionPane.showMessageDialog(null,"Este es un recordatorio para: " + contenido);
                vive = false;
            }
            try {
                Thread.sleep(60000);
                minutosPasados++;
            } catch (Exception e) {
            }
        }
    }
}
