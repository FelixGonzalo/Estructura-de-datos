package pila_varianteejercicio2;

public class Pilas {

    //Se maneja las dos pilas con los topes... si se deseara imprimir cada pila separada
    //Podrias crear 1 clase pila aparte, y instanciar dos pilas de la nueva clase pila aqui
    //crear dos array aqui tambien puede ser más easy :v
    private int Pilas[] = new int[12];
    private int topeA = 0, topeB = Pilas.length + 1;

    public void push(int dato, String tipoPila) {
        if ("A".equalsIgnoreCase(tipoPila) && topeB > topeA + 1 && topeA < 10) {
            Pilas[topeA] = dato;
            topeA++;
        } else {
            if ("B".equalsIgnoreCase(tipoPila) && topeB > topeA + 1 && topeB > 8) {
                topeB--;
                Pilas[topeB - 1] = dato;
            } else {
                System.out.println("Pila llena");
            }
        }
    }

    public void pop(String tipoPila) {
        if ("A".equalsIgnoreCase(tipoPila) && topeA > 0) {
            topeA--;
            Pilas[topeA] = 0;
        } else {
            if (topeB < Pilas.length + 1) {
                Pilas[topeB - 1] = 0;
                topeB++;
            } else {
                System.out.println("Pila Vacía");
            }
        }
    }

    public void mostrarArray() {
        System.out.println("----------Array de 2 pilas----------\nDatos...");
        for (int i = 0; i < Pilas.length; i++) {
            System.out.print(" [" + Pilas[i] + "]");
        }
        System.out.println(" ");
    }

}
