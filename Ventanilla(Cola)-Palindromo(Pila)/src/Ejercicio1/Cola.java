package Ejercicio1;

public class Cola {
    //Castro Cubas Félix ☺
    private int frente = -1;
    private int fin = -1;
    private int reingreso = 3;/*posición de reingreso*/
    private String cola[] = {" ", " ", " ", " ", " "};

    public void ingresar(String dato) {
        if (fin + 1 == cola.length) {
            System.out.println("\nLa cola esta llena");
        } else {
            fin += 1;
            cola[fin] = dato;
        }
        if (frente == -1) {
            frente = 0;
        }
    }

    public void reingresar() {
        if (frente == -1) {
            System.out.println("\nCola vacía");
        } else {
            String aux = cola[frente];
            if (fin < reingreso) {
                ordenarCola(0);//1
                cola[fin] = aux;
            } else {
                ordenarCola(1);
                cola[reingreso - 1] = aux;
            }
        }
    }

    public void ordenarCola(int caso) {
        if (caso == 1) {
            for (int i = 0; i < reingreso - 1; i++) {
                cola[i] = cola[i + 1];
            }//fin > reingreso
        } else {
            for (int i = 0; i < fin; i++) {
                cola[i] = cola[i + 1];
            }//eliminar || fin < reingreso
        }
    }

    public void eliminar() {
        if (frente == -1) {
            System.out.println("\nCola vacía");
        } else {
            if (frente == fin) {
                frente = -1;
                fin = -1;

            } else {
                ordenarCola(0);/*frente += 1;*/
                fin -= 1;
            }
            cola[fin + 1] = " ";
        }
    }

    public void mostrarDatos() {
        System.out.println("\n__________");
        System.out.println("|◘| .☺.|◘|");
        System.out.print("===========");
        for (int i = 0; i < cola.length; i++) {
            System.out.print("[" + cola[i] + "]");
        }
    }
}
