package p1;

/**
 *
 * @author Castro Cubas
 */
public class p1 {

    public static void main(String[] args) {
        String apellido[] = {"Federer", "Del Potro", "Djokovic", "Nadal", "Anderson", "Zverev"};
        String nombre[] = {"Roger", "Juan", "Novak", "Rafael", "Kevin", "Alexander"};
        double PuntosRanking[] = {5.660, 5.280, 7.535, 7.480, 4.220, 4.905};
        int compa = 0, intercambios = 0;
        //Ordenamiento --> Shell
        int in = PuntosRanking.length;
        double tempP;
        String tempN,tempA;
        do {
            in = in / 2;
            for (int k = 0; k < in; k++) {
                for (int i = in + k; i < PuntosRanking.length; i += in) {
                    int j = i;
                    compa +=1;
                    while (j - in >= 0 && PuntosRanking[j] < PuntosRanking[j - in]) {
                        compa +=1;
                        tempP = PuntosRanking[j];
                        tempA= apellido[j];
                        tempN = nombre[j];
                        PuntosRanking[j] = PuntosRanking[j - in];
                        apellido[j] = apellido[j-in];
                        nombre[j] = nombre[j-in];
                        PuntosRanking[j - in] = tempP;
                        apellido[j-in] = tempA;
                        nombre[j-in] = tempN;
                        intercambios +=1;
                        j -= in;
                    }
                } 
            }
            compa+=1;
        } while (in > 1);
        
        //mostrar datos
        System.out.println("\t6 PRIMEROS jugadores del TOP 100\n");
        for (int i =PuntosRanking.length-1; i >=0; i--) {
            System.out.print(/*" [" + */PuntosRanking[i] + "--> ");
            System.out.print(apellido[i]+" " + nombre[i]+"\n");
        }
        //resultados
        System.out.println("\nComparaciones: " + compa);
        System.out.println("Intercambios: " + intercambios);

    }
}
/**
 *
 * @author Castro Cubas
 */
