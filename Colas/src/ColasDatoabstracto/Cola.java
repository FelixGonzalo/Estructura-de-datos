package ColasDatoabstracto;

import java.util.ArrayList;

public class Cola {

    private int frente = 0;
    private int end = 0;
    private int cantidadDatos = 10;
    public ArrayList<RegistroIdentidad> Nacimientos = new ArrayList<RegistroIdentidad>();

    public void insercion(int numDNI, String surname, String name, String addressHouse, String fechaBorn, String sexo) {
        RegistroIdentidad onodo = new RegistroIdentidad(numDNI, surname, name, addressHouse, fechaBorn, sexo);
        if (end == cantidadDatos) {
            System.out.println("La cola esta llena");
        } else {
            end += 1;
            Nacimientos.add(end-1, onodo);//Nacimientos[end-1] = onodo;
        }
        if (frente == 0) {
            frente = 1;
        }
    }

    public void eliminacion() {
        if (frente == 0) {
            System.out.println("Cola vacía");
        } else {
            //Nacimientos.remove(frente - 1);//Nacimientos[frente-1] = 0;
            if (frente == end) {
                frente = 0;
                end = 0;
            } else {
                frente += 1;
            }
        }
    }

    public void mostrarCola() {
        RegistroIdentidad onodo = new RegistroIdentidad();
        int cont = 0;
        if (frente == 0 && end ==0) {
            System.out.println("No hay datos registrados");
        } else {
            System.out.println("\n-------REGISTROS DE NACIMIENTOS--------");
            for (int i = frente; i < end + 1; i++) {
                onodo = Nacimientos.get(i - 1);
                cont += 1;
                System.out.println("[" + (cont) + "] Nacimiento---->");
                System.out.println("\tDNI: " + onodo.getNumDNI());
                System.out.println("\tApellido: " + onodo.getSurname());
                System.out.println("\tnombre: " + onodo.getName());
                System.out.println("\tDirección: " + onodo.getAddressHouse());
                System.out.println("\tfecha de nacimiento: " + onodo.getFechaBorn());
                System.out.println("\tsexo: " + onodo.getSexo());
            }
        }

    }

    public void opciones() {
        System.out.println("------Registro de Nacimientos-------");
        System.out.println("[1]Registrar nacimiento\n[2]Eliminar Registro\n[3]Mostrar Nacimientos");
    }

}
