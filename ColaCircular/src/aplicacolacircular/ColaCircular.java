package aplicacolacircular;

public class ColaCircular {

    private int frente = 0;
    private int fin = 0;
    private int cola[] = new int[5];

    public void insertarDato(int dato) {
        if ((fin == cola.length && frente == 1) || (fin == frente - 1)) {
            System.out.println("Cola llena");
        } else {
            fin++;
            if (fin == cola.length + 1) {
                fin = 1;
                cola[fin - 1] = dato;
            } else {
                cola[fin - 1] = dato;
            }
        }
        if (frente == 0) {
            frente = 1;
        }
    }

    public void eliminarDato() {
        if (frente == 0) {
            System.out.println("Cola vacía");
        } else {
            cola[frente - 1] = 0;
            if (fin == frente) {
                frente = 0;
                fin = 0;
            }
        }
        if (frente == cola.length) {
            frente = 1;
        } else {
            if (fin != 0) {
                frente++;
            }

        }

    }

    public void opciones() {
        System.out.println("------COLA CIRCULAR-------");
        System.out.println("[1]Insertar dato\n[2]eliminar dato\n[3]Mostrar Cola");
    }

    public void mostrarCola() {
        System.out.println("------Cola-Circular------");
        int cont = 0;
        if (frente == 0 && fin == 0) {
            System.out.println("No hay datos registrados");
        } else {
            if (frente < fin || frente == fin) {
                //Cuando no a insertado datos de manera circular
                for (int i = frente; i < fin + 1; i++) {
                    cont++;
                    System.out.println("[" + cont + "]Dato -->" + cola[i - 1]);
                }

            } else {
                //Aprovecho la cola circular agregando un dato...
                for (int i = frente; i < cola.length + 1; i++) {
                    cont++;
                    System.out.println("[" + cont + "]Dato -->" + cola[i - 1]);
                }
                for (int i = 0; i < fin; i++) {
                    cont++;
                    System.out.println("[" + cont + "]Dato -->" + cola[i]);
                }

            }
        }

    }
}

//Se puede visualizar los datos mas facilmente usando solo un for si se quiere imprimir el Array
//Se notaran los espacios vacíos en este caso
//for --> int i = 0; i < cola.length; i++
//y cola[i]
