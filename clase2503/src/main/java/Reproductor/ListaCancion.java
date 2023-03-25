/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

import java.util.Scanner;

/**
 *
 * @author Emily Barrientos
 */
public class ListaCancion {
    
    public NodoMusic primero;
    
    public ListaCancion(){
        primero = null;
    }
    
    private String leerCancion(){
        System.out.println("Ingre el valro, -1 para terminar");
        return  (new Scanner(System.in).nextLine());
    }
    
    public ListaCancion crearLista(){
        String x;
        primero = null;
        do{
            x = leerCancion();
//            if(x != null){
//                primero = new NodoMusic (x,primero); 
//            }
        }while(x != null);
        return this;
    }

}
