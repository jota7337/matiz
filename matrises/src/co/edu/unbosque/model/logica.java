package co.edu.unbosque.model;

public class logica {

    private int matriz[][];




    public void crear(int tamaño) {

        int nfilas=tamaño;
        int ncolumnas= tamaño;
        matriz =new int[nfilas][ncolumnas];


        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz.length;j++) {



                matriz[i][j]=(int) ((Math.random()*tamaño)+1);

                System.out.print("["+matriz[i][j]+"]");
            }

            System.out.println("");

        }



    }




}
