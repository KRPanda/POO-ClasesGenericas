/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.generica;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Persona {
     int edad;
     String sexo, nombre;
    
    public Persona(int edad, String sexo, String nombre){
         this.edad=edad;
           this.sexo=sexo;
             this.nombre=nombre;
    }
    public Persona(){
        setNombre();
        setEdad();
        setSexo();
    }
     public void setNombre(){
   Scanner es = new Scanner (System.in);
        System.out.println("Escriba el nombre de la persona: ");
        this.nombre=es.nextLine();
}
    
   public void setEdad(){
         Scanner es = new Scanner (System.in);
        System.out.println("Escriba la edad de la persona: ");
        this.edad=es.nextInt();
        es.nextLine();
      
   }
   public void setSexo(){
       Scanner es = new Scanner (System.in);
        System.out.println("Escriba el sexo de la persona: ");
        this.sexo=es.nextLine();
   }
   
    public void getDatos(){
        System.out.println(""+this.nombre+" es "+this.sexo+" y tiene "+this.edad+" de edad");
    }
   
    
}
