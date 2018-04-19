/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingredientes;

import ingredientes.Ingrediente;
import java.util.LinkedList;
import menu.Plato;

/**
 *
 * @author Daniel Felipe Camargo Roa 20172020078 
 *         Edwin Andrés Salinas 20172020087
 *         Diego Velez 20172020075
 */

public abstract class Cocina {
    /**
     * Clase principal en la que se divide las bebidas, postres y principal.
     */
    LinkedList Ingredientes;
    
    public int getSize () {
        /**
         * Metodo para saber el tamaño de la linkedlist
         */
        return Ingredientes.size();
    }
    
    public String getNombreP(int i) {
        /**
         * Método para poner el nombre del ingrediente dentro de la interfaz
         */
        Ingrediente Ingn = (Ingrediente) Ingredientes.get(i);
        return Ingn.getNombre();
    }
    public Ingrediente getIng (int a){
        /**
         * Método para dar el precio del ingrediente
         */
        return (Ingrediente) Ingredientes.get(a);
    }
}
