/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

/**
 *
 * @author Emily Barrientos
 */
public class NodoMusic {
    
    Cancion dato;
    NodoMusic enlace;
    
    public NodoMusic(Cancion x){
        dato = x;
        enlace = null;
    }

}
