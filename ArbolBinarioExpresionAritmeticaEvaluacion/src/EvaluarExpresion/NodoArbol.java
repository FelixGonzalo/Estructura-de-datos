
package EvaluarExpresion;

public class NodoArbol {
    private char dato;
    private NodoArbol izq;
    private NodoArbol der;
    
    public NodoArbol(char dato) {
        this.dato = dato;
        this.der = null;
        this.izq=null;
    }
    public char getDato() { return dato;}
    public void setDato(char dato) {this.dato = dato;}
    public NodoArbol getIzq() {return izq;}
    public void setIzq(NodoArbol izq) {this.izq = izq;}
    public NodoArbol getDer() {return der;}
    public void setDer(NodoArbol der) {this.der = der;} 
}
