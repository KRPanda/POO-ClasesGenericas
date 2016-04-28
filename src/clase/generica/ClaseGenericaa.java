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
 * @param <T>
 */
public class ClaseGenericaa <T> {
     ArrayList<T> t = new ArrayList<>(100);
    
    public void AUD(T t){
        this.t.add(t);
                
            }
        
    
    public void AEP(int i, T t){
        try {
        this.t.add(i, t);
    }
        catch (Exception e){
            System.out.println("Ese espacio no existe");
        }
    }
    
    public ArrayList<T> getA(){
        return this.t;
    }
    
        public T getPrimero(){
            for (int i = 0; i < this.t.toArray().length; i++) {
                if (this.t.get(i) !=null){
                    return this.t.get(i);
                }
                
            }         
              return null;  
        }
        
             public T getUE (){
                 for (int i = this.t.toArray().length-1; i >= 0; i--) {
                     if (this.t.get(i) !=null) {
                         return this.t.get(i);
                         
                     }
                     
                 }
                 return null;
             }
        }
    

