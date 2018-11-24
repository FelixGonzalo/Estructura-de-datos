package Ejercicio4;

public class Ejercicio4 {
    //PALINDROMO
    private int tope = -1;
    char pila[] = new char[40];

    public void ingresar(String dato) {
        dato = dato.replaceAll(" ", "");
        for (int i = 0; i < dato.length(); i++) {
            pila[i] = dato.charAt(i);
            tope++;
        }
    }
    
    public static void main(String[] args) {
        Ejercicio4 pila = new Ejercicio4();
        String palabra = "aba el e aba";
        System.out.println("Palabra: " + palabra);
        pila.ingresar(palabra);
        pila.palindromoPila(palabra);//usando pila*/
        //pila.palindromo(palabra);//sin usar pila    
    }
    
    public void palindromoPila(String palabra) {
        palabra = palabra.replace(" ","");
        for (int i = 0; i < palabra.length(); i++) {
            //System.out.println(pila[tope]+"//"+palabra.charAt(i));
            if (pila[tope] != palabra.charAt(i)) {
                System.out.println("No es palindromo");
                break;
            }
            tope--;
        }
        if (tope == -1) {
            System.out.println("Es palindromo");
        }
    }

    public void palindromo(String palabra) {
        palabra = palabra.replace(" ", "");
        int cont = palabra.length() - 1;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != palabra.charAt(cont)) {
                System.out.println("No es palindromo");
                break;
            }
            cont--;
        }
        if (cont == -1) {
            System.out.println("Es palindromo");
        }
    }//sin usar pila
    
    
    
    
}
