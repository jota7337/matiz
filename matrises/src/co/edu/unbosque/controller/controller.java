package co.edu.unbosque.controller;

import co.edu.unbosque.model.logica;
import co.edu.unbosque.view.vista;

public class controller {


    private logica l;
    private vista v;


    public controller() {

        l=new logica();
        v=new vista();
        funcionar();

    }
    public void funcionar () {
        int n =v.leerDatoEntero("Digite cuantas matrizes quiere ");
        for (int i=0;i<n;i++) {
            int a =i+1;
            System.out.println("Caso " +a);

            l.crear(v.leerDatoEntero("La matriz"));
            System.out.println("\t");
        }


    }
}
