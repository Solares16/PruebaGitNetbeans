/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

import Analizador.*;

/**
 *
 * @author Solares
 */
public class PruebaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo c = new  Circulo(15);
        Cuadrado cd  = new Cuadrado(15, 20);
        System.out.println("El area del circulo es: "+c.area());
        System.out.println("El area del cuadrado es: " + cd.area());
        System.out.println("El Perimetro del cuadrado es: "+ cd.perimetro() );
        
        
        
    }
    
}
