package pila_varianteejercicio2;

import java.util.Scanner;

/**
 * Control de 2 pilas con un array Array de longitud-->[12] PilaA:Ingresa los
 * datos por la izquierda hasta Array[9] PilaB: Ingresar ls datos por la derecha
 * hasta Array[7] Modificar los metodos de meter(push) y sacar(pop)
 */
public class PILA_VarianteEjercicio2 {

    //Castro Cubas
    //Los datos para la Pila A: seran menores a 100 y para B: mayores a 100
    //Para visualizar mejor el array
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Pilas pilas1 = new Pilas();
        int dato, op;
        String tipoPila;
        System.out.println("--------[a]Pila1----[b]Pila2-----------");
        System.out.println("\t[1]Agregar Dato\n\t[2]Eliminar Dato\n\t[3]Mostrar Datos\n\t[0]salir");
        do {
            System.out.print("Opción: ");
            op = tec.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingresa el Dato: ");
                    dato = tec.nextInt();
                    System.out.print("Tipo de pila: ");
                    tipoPila = tec.next();
                    pilas1.push(dato, tipoPila);
                    break;
                case 2:
                    System.out.println("ELIMINAR...");
                    System.out.print("Ingrese tipo de pila: ");
                    tipoPila = tec.next();
                    pilas1.pop(tipoPila);
                    break;
                case 3:
                    pilas1.mostrarArray();
                    break;
                case 0:
                    System.out.println("SALISTE !!");
                    break;
                default:
                    System.out.println("Opción no existente");
            }
        } while (op != 0);

    }

}
