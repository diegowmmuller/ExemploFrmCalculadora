
package Model;

/**
 *
 * @author Diiego
 */
public class Calculadora {
    
    private double valueA;
    
    private double valueB;
    
    public Calculadora(){
    }

    public Calculadora(double valueA, double valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public double getValueA() {
        return valueA;
    }

    public void setValueA(double valueA) {
        this.valueA = valueA;
    }

    public double getValueB() {
        return valueB;
    }

    public void setValueB(double valueB) {
        this.valueB = valueB;
    }          
    
    public double somar(){
        return valueA + valueB;
    }
    
    public double subtrair(){
        return valueA - valueB;
    }
    
    public double multiplicar(){
        return valueA * valueB;
    }
    
    public double dividir(){
        return valueA / valueB;
    }
    
    
    
}
