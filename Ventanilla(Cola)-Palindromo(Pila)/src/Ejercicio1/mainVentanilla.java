

package Ejercicio1;

import javax.swing.JOptionPane;

public class mainVentanilla {
    //Castro Cubas Félix ☺
    public static void main(String[] args) {
        Cola cola1 = new Cola();
        cola1.mostrarDatos();
        String dato;
        int op = 1;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "[1]Ingresar\n[2]reingresar\n[3]Atender\n[4]mostrar cola"
                    + "\n[0]salir\neliga una opción", "VENTANILLA", JOptionPane.DEFAULT_OPTION));
            switch (op) {
                case 1:
                    dato = JOptionPane.showInputDialog(null, "Ingrese dato", "VENTANILLA", JOptionPane.DEFAULT_OPTION);
                    cola1.ingresar(dato);
                    break;
                case 2:
                    cola1.reingresar();
                    break;
                case 3:
                    cola1.eliminar();
                    break;
                case 4:
                    cola1.mostrarDatos();
                    break;
                case 0:
                    System.out.println("\nSaliste....");
                    break;
                default:
                    System.out.println("\nOpción no existente");
            }

        } while (op != 0);
    }
}
