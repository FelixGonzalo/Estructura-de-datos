package aplicacolacircular;

import javax.swing.JOptionPane;

public class AplicaColaCircular {

    public static void main(String[] args) {
        ColaCircular cola1 = new ColaCircular();

        cola1.opciones();
        int dato;
        int op = 1;
        boolean code = true;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "[1]Insertar dato\n[2]eliminar dato\n[3]Mostrar Cola", "CC-OPCIONES", JOptionPane.DEFAULT_OPTION));
            switch (op) {
                case 1:
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese dato", "Cola Circular", JOptionPane.DEFAULT_OPTION));
                    cola1.insertarDato(dato);
                    break;
                case 2:
                    cola1.eliminarDato();
                    break;
                case 3:
                    cola1.mostrarCola();
                    break;
                default:
                    System.out.println("Opción no existente");

            }
            op = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
            if (JOptionPane.OK_OPTION == op) {

            } else {
                code = false;
            }
        } while (code != false);
    }

}
