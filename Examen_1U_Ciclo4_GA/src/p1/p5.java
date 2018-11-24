package p1;

/**
 *
 * @author Castro Cubas
 */
public class p5 {

    public static void main(String[] args) {
        String Dato[] = {"I", " ", " ", "A", " ", "O", " ", "F", " ", "J"};
        int enlace[] = {9, -1, -1, 7, -1, 3, -1, 0, -1, 5};
        int frente = 3;

        int ptr = frente;
        int cVocal = 5,cConsonante = 10;
        int sumatotal= 0;
        do {
            String aux = Dato[ptr];
            if ("a".equalsIgnoreCase(aux) || "e".equalsIgnoreCase(aux)
                    || "i".equalsIgnoreCase(aux) || "o".equalsIgnoreCase(aux) || "u".equalsIgnoreCase(aux)) {
                    sumatotal +=cVocal*ptr;
                     cVocal +=1;
            }else{
                sumatotal += cConsonante*ptr;
                cConsonante +=10;
            }
            System.out.println(sumatotal);
            ptr = enlace[ptr];
        } while (ptr != frente);
        
        System.out.println("resultado: "+ sumatotal);
    }
}
/**
 *
 * @author Castro Cubas
 */
