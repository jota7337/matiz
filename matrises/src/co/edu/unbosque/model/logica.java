package co.edu.unbosque.model;

import javax.swing.*;

public class logica {

    private int matriz[][];




    public int[][] crear(int tamaño) {

        int nfilas=tamaño;
        int ncolumnas= tamaño;
        matriz =new int[nfilas][ncolumnas];


        for (int i=0;i<matriz.length;i++) {
            String lin= JOptionPane.showInputDialog("ingrese la "+(i+1)+" fila de numeros de el arr con espacio");
            String[] arra=lin.split(" ");
            for (int j=0;j<matriz.length;j++) {



                matriz[i][j]=Integer.parseInt(arra[j]);

                System.out.print("["+matriz[i][j]+"]");
            }

            System.out.println("");

        }

        return matriz;

    }

    public String regiones(int[][] lista){
        String res="YES";
        outterloop:
        for(int i=0;i< lista.length;i++){
            for(int k=0;k<lista.length;k++){
                System.out.println("este es i "+i);
                System.out.println("este es k "+k);
                if(i == lista.length-1 || k == lista.length-1){
                    break outterloop;
                }
                else if( k>=1){
                    System.out.println("este es i "+i);
                    System.out.println("esta es la linea 48");
                    System.out.println("estes el k despues de entra al else if "+k);
                    if(lista[i][k] != lista[i+1][k+1] && lista[i][k] != lista[i][k+1] ){
                        System.out.println("esta entrando en el if");
                        if(lista[i][k] != lista[i+1][k] && lista[i][k-1] != lista[i][k]){
                            System.out.println("este es el siso de la linea 56");
                            System.out.println("este es i y k "+i+" "+k);
                            System.out.println("este es el elemento de la lista[0][2] "+lista[i][k]);
                            res="NO";
                        }
                    if(lista[i][k] == lista[i+1][k+1] && lista[i][k] != lista[i][k+1] ){
                        if(lista[i][k] != lista[i+1][k]){
                            System.out.println("este es el siso de la linea 61");
                            res="NO";
                        }
                    }
                    }
                }else{
                    if(lista[i][k] != lista[i][k+1] && lista[i][k] != lista[i+1][k+1] && lista[i][k] != lista[i+1][k]){
                        res="NO";
                    }
                    if(lista[i][k] == lista[i+1][k+1] && lista[i][k] != lista[i][k+1] && lista[i][k] != lista[i+1][k]){
                        res="NO";
                    }

                }
            }
        }
        return res;
    }


}
