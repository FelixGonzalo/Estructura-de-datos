
package EvaluarExpresion;
    //Castro Cubas
public class Main {
    
    public static void main(String[] args) {
        System.out.println("---Estructura de Datos---");
        System.out.println("arboles binarios Expresión\n");
        ArbolBinario arbolito = new ArbolBinario();
        System.out.println("Creando el arbol Binario: ");
        System.out.println("Expresión: (5+4)*(6-(2+1))");
        System.out.println("            [*]   ");
        System.out.println("           /   \\");
        System.out.println("         [+]     [-]");
        System.out.println("        /  \\    /   \\");
        System.out.println("      [5]   [4][6]  [+]");
        System.out.println("                   /   \\");
        System.out.println("                 [2]    [1]");

        //insertar la secuencia
        arbolito.insertarNodoExpresion(arbolito.raiz,'*',' ',' ');
        arbolito.insertarNodoExpresion(arbolito.raiz,'+','*','I');
        arbolito.insertarNodoExpresion(arbolito.raiz,'5','+','I');
        arbolito.insertarNodoExpresion(arbolito.raiz,'4','+','D');
        arbolito.insertarNodoExpresion(arbolito.raiz,'-','*','D');
        arbolito.insertarNodoExpresion(arbolito.raiz,'6','-','I');
        arbolito.insertarNodoExpresion(arbolito.raiz,'+','-','D');
        arbolito.insertarNodoExpresion(arbolito.raiz,'2','+','I');
        arbolito.insertarNodoExpresion(arbolito.raiz,'1','+','D');//*/

        System.out.println("\nResultado: "+arbolito.evaluarExpresion(arbolito.raiz));
    }
}
