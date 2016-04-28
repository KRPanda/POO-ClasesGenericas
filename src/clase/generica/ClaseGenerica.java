/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.generica;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class ClaseGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("\nInician los ejemplos con Ints");
        ClaseGenericaa<Integer> lista = new ClaseGenericaa<>();
        lista.AUD(3);
        lista.AEP(3, 3);
        lista.AUD(4);
        lista.AUD(5);
        lista.AUD(6);
        lista.AUD(7);
        lista.AUD(8);
        System.out.println(""+lista.getA());
        lista.AEP(3, 3);
        System.out.println(""+lista.getPrimero());
        System.out.println(""+lista.getUE());
        System.out.println(""+lista.getA());
        System.out.println("\nInician los ejemplos con Floats");
        ClaseGenericaa<Float> listaFloat = new ClaseGenericaa<>();
        System.out.println(""+lista.t.toArray().length);
        listaFloat.AUD(3.1416f);
        listaFloat.AUD(4.123f);
        listaFloat.AUD(5.32f);
        listaFloat.AUD(6.55f);
        listaFloat.AUD(7.66f);
        listaFloat.AUD(6.66f);
        System.out.println(""+listaFloat.getA());
        listaFloat.AEP(3, 0.00f);
        System.out.println(""+listaFloat.getPrimero());
        System.out.println(""+listaFloat.getUE());
        System.out.println(""+listaFloat.getA());
        System.out.println("\nInician los ejemplos con String");
        ClaseGenericaa<String> listaString = new ClaseGenericaa<>();
        listaString.AUD("hola");
        listaString.AUD("mundo");
        listaString.AUD("como");
        listaString.AUD("?");
        System.out.println(""+listaString.getA());
        listaString.AEP(3, "están");
        System.out.println(""+listaString.getA());
        System.out.println(""+listaString.getPrimero());
        System.out.println(""+listaString.getUE());
        System.out.println("\nInician los ejemplos con personas");
        ClaseGenericaa<Persona> listaPersonas = new ClaseGenericaa<>();
        Persona Pedro = new Persona ("Pedro",13,"hombre");
        Persona Juan = new Persona ("Juan",2, "hombre");
        Persona Marta = new Persona ("Marta",33, "mujer");
        Persona pillo = new Persona ("???",144, "indefinido");
        listaPersonas.AUD(Pedro);
        listaPersonas.AUD(Juan);
        listaPersonas.AUD(Marta);
        listaPersonas.AUD(pillo);
        System.out.println("\nmuestra el primero y último");
        listaPersonas.getPrimero().getDatos();
        listaPersonas.getUE().getDatos();
        System.out.println("\nMuestra toda la lista");
        ArrayList<Persona> listaDePersonas = listaPersonas.getA();
        for (int i = 0; i < listaDePersonas.size(); i++) {
            listaDePersonas.get(i).getDatos();
        }
        Persona willyMeloyo = new Persona ("Willy Meloyo",18, "Macho");
        System.out.println("\nmuestra lo primero, último y todo al haber agregado un nuevo elemento a la lista");
        listaPersonas.AEP(0, willyMeloyo);
        listaDePersonas = listaPersonas.getA();
        listaPersonas.getPrimero().getDatos();
        listaPersonas.getUE().getDatos();
        for (int i = 0; i < listaDePersonas.size(); i++) {
            listaDePersonas.get(i).getDatos();
    }
    
}
}
