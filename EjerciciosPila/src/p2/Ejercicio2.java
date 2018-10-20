package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//Castro Cubas
public class Ejercicio2 {

    /*
    Supongamos que un algoritmo(Pseudo codigo)requiere 2 pilas.A(n1) y B(n2).
    No disponemos de mucha memoria y para evitar desbordamientos, es decir que la
    cantidad de elementos de A sea mayor que n1 o que la cantidad de elementos,con
    la particularidad que la Pila A mete sus datos por laizquierda desde el 
    elemento n. Modifique las operaciones METER y SACAR para este caso.
     */
    class Nodo {

        int dato;
        int tipopila;
    }
    ArrayList<Nodo> Lista = new ArrayList<Nodo>();
    Pilas pilaA = new Pilas(2);
    Pilas pilaB = new Pilas(3);

    public void agregarDatoLista(int dato, int tipopila) {
        if (tipopila == 1) {
            pilaA.push(dato);
        } else {
            pilaB.push(dato);
        }
        Nodo onodo = new Nodo();
        onodo.dato = dato;
        onodo.tipopila = tipopila;
        Lista.add(onodo);
    }

    public void eliminarDatoLista() {
        Nodo onodo = new Nodo();
        onodo = Lista.get(Lista.size() - 1);
        if (onodo.tipopila == 1) {
            pilaA.pop();
        } else {
            pilaB.pop();
        }
        Lista.remove(Lista.size() - 1);
    }

    public void listaOpciones(int dato, int tipoPila) {

        switch (tipoPila) {
            case 1:
                agregarDatoLista(dato, tipoPila);
                break;
            case 2:
                agregarDatoLista(dato, tipoPila);
                break;
            default:
                System.out.println("Pila no existente !!");
        }
    }
    //public void MostrarLista(){
    //Iterator<Nodo> it = Lista.iterator(); // Sirve para recorrer el ArrayList
    //while(it.hasNext()){//Comprueba si siguen quedando elementos

    public void MostrarPilas() {
        pilaA.imprimir_pila();
        pilaB.imprimir_pila();
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Ejercicio2 lista = new Ejercicio2();
        int dato, tipoPila, op;
        System.out.println("\t----------Pilas-----------\n\tPilas -->[1] y [2]\n\t[1]Inserte Dato"
                + "\n\t[2]Eliminar Dato\n\t[3]Mostrar Pilas\n\t[0]Salir");
        do {
            System.out.print("Opción: ");
            op = tec.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Inserte dato:");
                    dato = tec.nextInt();
                    System.out.print("Tipo de pila:");
                    tipoPila = tec.nextInt();
                    lista.listaOpciones(dato, tipoPila);
                    break;//insertar
                case 2:
                    lista.eliminarDatoLista();
                    break;//eliminar
                case 3:
                    lista.MostrarPilas();
                    break;
                case 0:
                    System.out.println("FINALIZO");
                    break;
                default:
                    System.out.println("Opción no disponible");
            }
        } while (op != 0);

    }
}
