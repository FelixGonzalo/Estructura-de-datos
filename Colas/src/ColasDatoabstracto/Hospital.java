package ColasDatoabstracto;

import javax.swing.JOptionPane;

public class Hospital {
    //Castro Cubas
    public static void main(String[] args) {
        Cola cola1 = new Cola();
        int numDNI;
        String surname, name, addressHouse, fechaBorn, sexo;
        int op = 1;
        boolean code = true;
        cola1.opciones();
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "eliga una opción:\n[1]Registrar nacimiento\n[2]Eliminar Registro\n[3]Mostrar Nacimientos",
                    "OPCIONES", JOptionPane.DEFAULT_OPTION));
            switch (op) {
                case 1:
                    numDNI = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese DNI", "HOSPITAL", JOptionPane.DEFAULT_OPTION));
                    surname = JOptionPane.showInputDialog(null, "Ingrese apellido", "HOSPITAL", JOptionPane.DEFAULT_OPTION);
                    name = JOptionPane.showInputDialog(null, "Ingrese nombre", "HOSPITAL", JOptionPane.DEFAULT_OPTION);
                    addressHouse = JOptionPane.showInputDialog(null, "Ingrese dirección de Hogar", "HOSPITAL", JOptionPane.DEFAULT_OPTION);
                    fechaBorn = JOptionPane.showInputDialog(null, "Ingrese fecha de nacimiento", "HOSPITAL", JOptionPane.DEFAULT_OPTION);
                    sexo = JOptionPane.showInputDialog(null, "Ingrese sexo", "HOSPITAL", JOptionPane.DEFAULT_OPTION);
                    cola1.insercion(numDNI, surname, name, addressHouse, fechaBorn, sexo);
                    break;
                case 2:
                    cola1.eliminacion();
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
