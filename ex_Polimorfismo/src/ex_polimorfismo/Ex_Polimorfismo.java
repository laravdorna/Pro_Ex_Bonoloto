/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex_polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Ex_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //polimorfismo
        
        Persoa p= new Persoa("pepe", 15000);
        Persoa dep= new Deportista("hokey", "alex", 5000);
        Persoa pro= new  Profesorado("programacion", "nina", 2000);
        Deportista d= new  Deportista();
        ArrayList<Persoa> l = new ArrayList<>();
        
        System.out.println("Persoa"+p.calcularSoldo());
        System.out.println("Deportista"+dep.calcularSoldo());
        System.out.println("Profesor"+pro.calcularSoldo());
        //un deportista es de tipo persona por lo que deja igularlo directamente
        p=d;
        //unha persoan non é necesariamente un deportista polo que hay unha incomgruencia e hai que castear 
        d=(Deportista) p;
        //array list
        
        l.add(p);
        l.add(dep);
        l.add(pro);
        l.add(d);
        Metodos.amosar(l);
    }

}
