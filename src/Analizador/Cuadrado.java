
package Analizador;

/**
 *
 * @author Solares
 */
public class Cuadrado {
    
    int LadoA;
    int LadoB; 

    public Cuadrado(int LadoA, int LadoB) {
        this.LadoA = LadoA;
        this.LadoB = LadoB;
    }
    
    public int area (){
        return this.LadoA * this.LadoB;
    }
    
    public int perimetro(){
        return  this.LadoA + this.LadoB;
    }
    
}
