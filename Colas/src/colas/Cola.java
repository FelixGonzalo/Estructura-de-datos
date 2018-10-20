package colas;

public class Cola {

    private int frente = 0;
    private int end = 0;
    private int cola[] = new int[5];

    public void insercion(int dato) {
        if (end == cola.length) {
            System.out.println("La cola esta llena");
        } else {
            end += 1;
            cola[end - 1] = dato;
        }
        if (frente == 0) {
            frente = 1;
        }
    }

    public void eliminacion() {
        if (frente == 0) {
            System.out.println("Cola vacía");
        } else {
            cola[frente - 1] = 0;
            if (frente == end) {
                frente = 0;
                end = 0;
            } else {
                frente += 1;
            }
        }
    }

    public void mostrarCola() {
        if (frente == 0 && end == 0) {
            System.out.println("No hay datos registrados");
        } else {
            System.out.println("-------DATOS--------");
            int cont = 0;
            for (int i = frente; i < end + 1; i++) {
                cont += 1;
                System.out.println("[" + (cont) + "] Dato---->" + cola[i - 1]);
            }
        }

    }

    public void opciones() {
        System.out.println("------COLA-------");
        System.out.println("[1]Insertar dato\n[2]eliminar dato\n[3]Mostrar Cola");
    }

}
