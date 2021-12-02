/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Poke
 */
public class NodoDoble {
    String nombre, direccion;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    
    //constructor para cuando todavia no hay nodos

    public NodoDoble(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        //apuntadores
        siguiente = null;
        anterior = null;
        
    }

   
    

    
    
    
}