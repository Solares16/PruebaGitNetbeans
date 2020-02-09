
package Analizador;

/**
 *
 * @author Solares
 */
public class Circulo {
    
    int radio; 

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public double area(){
        return 2* Math.PI * this.radio;
    }
    
    
}
