/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import ingredientes.Ingrediente;
import java.util.LinkedList;

/**
 *
 * @author Daniel Felipe Camargo Roa 20172020078 
 *         Edwin Andrés Salinas 20172020087
 *         Diego Velez 20172020075
 */

public class Plato {
    LinkedList Ingredientes = new LinkedList();
    String Nombre;
    int Precio;
    Ingrediente Ingn;
    
    public void preparar(Ingrediente c) {
        /**
         * @param Ingrediente
         * @return Ingrediente c
         */
        Ingredientes.add(c);
        for (int i = 0; i < Ingredientes.size(); i++) {
            Ingn = (Ingrediente) Ingredientes.get(i);
            System.out.println(Ingn.getNombre());
        }
    }
    
    public void quitar (int i) {
        /**
         * Metodo para remover ingrediente
         */
        Ingredientes.remove(i);
    }

    public void setPlato (String Nombre, int Precio) {
        /**
         * @param Nombre
         * @param Precio
         * @return Nombre
         * @return sumarPrecios
         */
        this.Nombre = Nombre;
        this.Precio = sumarPrecios();
    }
    
    public int sumarPrecios () {
        /**
         * Metodo para obtener el precio total
         */
        int PrecioTotal= 0;
        for (int i = 0; i<Ingredientes.size(); i++) {
            Ingn = (Ingrediente) Ingredientes.get(i);
           PrecioTotal += Ingn.getPrecio();
        }
        return PrecioTotal;
    }

    public String getNombre() {
        /**
         * @return Nombre
         */
        return Nombre;
    }

    public void setNombre(String Nombre) {
        /**
         * @param referencia String Nombre
         */
        this.Nombre = Nombre;
    }

    public LinkedList getIngredientes() {
        /**
         * @param referencia Ingredientes
         */
        return Ingredientes;
    }

    public void limpiar () {
        /**
         * Metodo para limpiar
         */
        Ingredientes.clear();
        Nombre="";
    }
}
