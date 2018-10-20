package p2;

import java.util.ArrayList;

public class Pilas {
    
    class Nodo {

        int info;

    }

    private int tope = 0;
    private int nCantidadElementos;
    public ArrayList<Nodo> Pila = new ArrayList<Nodo>();

    public Pilas(int nCantidadElementos) {
        this.nCantidadElementos = nCantidadElementos;
    }

    public int getTope() {
        return this.tope;
    }

    public int getCantidadElementos() {
        return this.nCantidadElementos;
    }

    public int getDatoPila(int posicion) {
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

    public void push(int dato) {
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
        System.out.println("----------PILAS-----------");
        int tope = this.getTope();
        for (int i = tope; i > 0; i--) {
            System.out.println("[" + i + "]-------> Dato :" + getDatoPila(i - 1));
        }
    }
}
