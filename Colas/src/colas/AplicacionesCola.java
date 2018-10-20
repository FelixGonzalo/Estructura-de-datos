
package colas;

import javax.swing.JOptionPane;
public class AplicacionesCola {
    //Castro Cubas
    public static void main(String[] args) {
        Cola cola1 = new Cola();
        cola1.opciones();
        int dato;
        int op = 1;
        boolean code = true;
        
        do{  
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"eliga una opción", "OPCIONES",JOptionPane.DEFAULT_OPTION));
        switch (op){
            case 1:
                dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese dato", "Cola",JOptionPane.DEFAULT_OPTION));
                cola1.insercion(dato);
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
        op = JOptionPane.showConfirmDialog(null,"¿Deseas continuar?");
        if (JOptionPane.OK_OPTION == op) {
            
        } else {
            code = false;
        }
        }while(code != false);
        
        
        
        
        
       
    }
    
    
    
}
