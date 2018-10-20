
package p1_pag29.pilas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
//Castro Cubas
/*
Elabore el algoritmo que permita ingresar una cadena y luego la imprima
en orden inverso, emplear una estructura PILA
*/
public class Pilas {
    
    class Nodo {
        char info;
    }

    private int tope = 0;
    private int nCantidadElementos = 10;
    public ArrayList<Nodo> Pila = new ArrayList<Nodo>();

    public int getTope() {
        return this.tope;
    }

    public int getCantidadElementos() {
        return this.nCantidadElementos;
    }

    public char getDatoPila(int posicion) {
        Nodo onodo = new Nodo();
        onodo = Pila.get(posicion);
        return onodo.info;
    } //obtener el dato de la Pila

    private void AumentarTope() {
        this.tope++;
    }

    private void DisminuirTope() {
        this.tope--;
    }

    public void push(char dato) {
        if (this.tope < this.nCantidadElementos) {
            Nodo onodo = new Nodo();//creo un nodo, me sirve para crear una instancia ne la clase nodo
            onodo.info = dato;
            Pila.add(onodo); //agrego una lista
            this.AumentarTope();
            onodo = null; //Liberando memoria
        } else {
            System.out.println("La Pila esta llena");
        }

    } //el tope va a subir para agregar dato

    public void pop() {
        if (this.tope > 0) {
            Pila.remove(this.tope - 1);
            this.DisminuirTope();
        } else {
            System.out.println("La Pila esta vacia");
        }
    }//tope va a disminuir para eliminar dato

    public void imprimir_pila() {
        System.out.println("ED_PILAS    ");
        int tope = this.getTope();
        for (int i = tope; i > 0; i--) {
            System.out.println("[" + i + "]-------> Dato :" + getDatoPila(i-1));
        }
    }
    
    //Ingresar una cadena y usar pila para guardar sus palabras
    public void letras(String dato){
        char pal;
        for (int i = 0; i < dato.length(); i++) {
            Nodo onodo = new Nodo();
            pal = dato.charAt(i);
            onodo.info = pal;
            Pila.add(onodo);
            this.AumentarTope();
            onodo = null; //Liberando memoria
        }
    } // Obtiene las letras
    
    public static void main(String[] args) {
        Pilas pila = new Pilas();
        String cadena;
        cadena = JOptionPane.showInputDialog(null,"Ingrese una cadena","PILA", JOptionPane.DEFAULT_OPTION);    
        pila.letras(cadena);
        pila.imprimir_pila();
        
        

    }
    
}
