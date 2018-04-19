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

public class Principal extends Cocina {
    
    public Principal() {  
        /**
         * Esta clase nos deja crear los elementos para formar un plato 
         * "principal" para que el usuario los escoja.
         * Es una subclase de Cocina
         */
        Ingredientes = new LinkedList();
        Ingredientes.add(new Ingrediente("Arroz",1500));
        Ingredientes.add(new Ingrediente("Pollo",1600));
        Ingredientes.add(new Ingrediente("Frijol",1000));
        Ingredientes.add(new Ingrediente("Pasta",2500));
        Ingredientes.add(new Ingrediente("Aguacate",1500));
        Ingredientes.add(new Ingrediente("Ensalada",1500));
        Ingredientes.add(new Ingrediente("Carne",2000));
        Ingredientes.add(new Ingrediente("Papa",1500));
    }
    
    @Override
    public int getSize () {
        System.out.println(Ingredientes.size());
        return Ingredientes.size();
    }
    
}
