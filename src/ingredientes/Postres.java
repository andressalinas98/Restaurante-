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

public class Postres extends Cocina{

    public Postres() {      
        /**
         * Esta clase nos permite crear los postres que el usuario elija.
         * Es una subclase de Cocina
         */
        Ingredientes = new LinkedList();
        Ingredientes.add(new Ingrediente("Arroz con leche",1500));
        Ingredientes.add(new Ingrediente("Gelatina",1300));
        Ingredientes.add(new Ingrediente("Panelita",1000));
        Ingredientes.add(new Ingrediente("Muffin",2500));
    }
    
    @Override
    public int getSize () {
        System.out.println(Ingredientes.size());
        return Ingredientes.size();
    }
    
}
