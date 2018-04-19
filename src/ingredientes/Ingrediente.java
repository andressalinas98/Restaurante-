/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingredientes;

/**
 *
 * @author Daniel Felipe Camargo Roa 20172020078 
 *         Edwin Andrés Salinas 20172020087
 *         Diego Velez 20172020075
 */

public class Ingrediente {
    String Nombre;
    int Precio;

    public Ingrediente(String Nombre, int Precio) {
        /**
         * @param Nombre
         * @param Precio
         */
        this.Nombre = Nombre;
        this.Precio = Precio; 
    }

    public String getNombre() {
        /**
         * @return Nombre
         */
        return Nombre;
    }

    public int getPrecio() {
        /**
         * @return Precio
         */
        return Precio;
    }
    
}
