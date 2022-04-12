package co.edu.unbosque.view;

import javax.swing.*;

public class vista {


    private int select;



    public int getSelect() {
        return select;
    }

    public void setSelect(int select) {
        this.select = select;
    }

    public vista () {

        select=-1;
    }

    public int leerDatoEntero(String mensaje) {
        String aux = JOptionPane.showInputDialog(mensaje);
        int dato = Integer.parseInt(aux);
        return dato;
    }



    public String leerDatoString(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        return dato;
    }



    public void mostrarInformacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
