package appbuzon;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Correo {
    private String listaCorreo;
    private boolean leido;

    public Correo() {
    }

    public Correo(String correosElectronicos) {
        this.listaCorreo = JOptionPane.showInputDialog("Introduce correo: ");
        this.leido = false;
    }

    public String getListaCorreo() {
        return listaCorreo;
    }

    public void setListaCorreo(String listaCorreo) {
        this.listaCorreo = listaCorreo;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    
}
