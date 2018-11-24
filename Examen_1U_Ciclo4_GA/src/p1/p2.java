
package p1;
/**
 *
 * @author Castro Cubas
 */
public class p2 {
    public static void main(String[] args) {
        String Dato[] = {"I"," "," ","A"," ","O"," ","F"," ","J"};
        int enlace[]={9,-1,-1,7,-1,3,-1,0,-1,5};
        
        //recorrido
        int start = 3;
        int ptr = start;
        do {
            System.out.print(Dato[ptr]);
            ptr = enlace[ptr];
        } while (ptr != start);
        
        //imprimir las vocal y su posición que le corresponde
        System.out.println("--------------------\n");
        do {
            String aux = Dato[ptr];
            if (("a").equalsIgnoreCase(aux) || "e".equalsIgnoreCase(aux)
                    || "i".equalsIgnoreCase(aux) || "o".equalsIgnoreCase(aux) || "u".equalsIgnoreCase(aux)) {
                System.out.println("vocal: "+Dato[ptr]+" posición-->"+ptr);
            } 
            ptr = enlace[ptr];
        } while (ptr != start);
    }
}
/**
 *
 * @author Castro Cubas
 */