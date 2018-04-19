/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingredientes;

import java.util.LinkedList;

/**
 *
 * @author Daniel Felipe Camargo Roa 20172020078 
 *         Edwin Andrés Salinas 20172020087
 *         Diego Velez 20172020075
 */

public class Bebidas extends Cocina {
    /**
     * Esta clase nos permite crear las bebidas que el usuario eligirá para
     * el plato usando la LinkedList
     * 
     * Bebidas es una subclase de Cocina
     */
    public Bebidas() {       
        Ingredientes = new LinkedList();
        Ingredientes.add(new Ingrediente("Gaseosa",2000));
        Ingredientes.add(new Ingrediente("Agua",1500));
        Ingredientes.add(new Ingrediente("Jugos naturales",1800));
        Ingredientes.add(new Ingrediente("Bebida con alcohol",1300));
    }
    
    @Override
    public int getSize () {
        return Ingredientes.size();
    }
    
}
