package p1;

import java.util.Scanner;
/**
 *
 * @author Castro Cubas
 */
public class p3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String Dato[] = {"I", " ", " ", "A", " ", "O", " ", "F", " ", "J"};
        int enlace[] = {9, -1, -1, 7, -1, 3, -1, 0, -1, 5};

        //ingresar el dato a eliminar
        String datoElim;
        System.out.println("Dato para eliminar: ");
        datoElim = tec.next();
        
        //buscar el dato para eliminar
        int start = 3;
        int ptr = start;
        int PRE = 5;//enlace para el ultimo
        int POS = -1;
        do {
            if (datoElim.equalsIgnoreCase(Dato[ptr])) {
                POS = ptr;
            } else {
                PRE = ptr;//toma el valor del ptr previo al correcto
                ptr = enlace[ptr];
            }
        } while (ptr !=start && POS ==-1);

        //Eliminar el dato
        if (POS == -1) {
            System.out.println("El dato no se encuentra");
        } else {
            if (POS == start) {
                start = enlace[start];
            }
            enlace[PRE] = enlace[POS];
            enlace[POS] = -1;
            Dato[POS] = " ";
        }
        //imprimiendo
        ptr = start;
        do {
            System.out.println("vocal: " + Dato[ptr] + " enlace-->" + enlace[ptr]);
            ptr = enlace[ptr];
        } while (ptr != start);
        //ver el array
        for (int i = 0; i < Dato.length; i++) {
            System.out.println("["+Dato[i]+"]");
        }
    }
}
/**
 *
 * @author Castro Cubas
 */