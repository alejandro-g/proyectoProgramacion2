
package proyecto;

import java.io.Serializable;

public class Mensaje implements Serializable{
    private String ususarioDestino;
    private String autor;
    private String mensaje;
    private boolean read;

    public Mensaje(String ususarioDestino, String autor, String mensaje, boolean read) {
        this.ususarioDestino = ususarioDestino;
        this.autor = autor;
        this.mensaje = mensaje;
        this.read = read;
    }

    public String getUsusarioDestino() {
        return ususarioDestino;
    }

    public void setUsusarioDestino(String ususarioDestino) {
        this.ususarioDestino = ususarioDestino;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "ususarioDestino=" + ususarioDestino + ", autor=" + autor + ", mensaje=" + mensaje + ", read=" + read + '}';
    }

   
    
    
}
