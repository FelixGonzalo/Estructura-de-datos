package EvaluarExpresion;
//Castro Cubas

public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public boolean insertarNodoExpresion(NodoArbol raiz, char datoInsertar, char datoPadre, char lado) {
        NodoArbol aux;
        //verificamos si esta vacio el arbol
        if (raiz == null) {
            NodoArbol nodoNuevo = new NodoArbol(datoInsertar);//creamos nodo
            this.raiz = nodoNuevo;
            System.out.println("Se inserto " + datoInsertar + " como Raiz");
            return true;//se pudo insertar
        } else {
            aux = raiz;
            if (aux.getDato() == datoPadre) {
                if (lado == 'D') {//Verificamos si se desea ingresar a la derecha
                    if (aux.getDer() == null) {
                        NodoArbol nodoNuevo = new NodoArbol(datoInsertar);
                        aux.setDer(nodoNuevo);
                        System.out.println("Se inserto " + datoInsertar + " como hijo derecho " + datoPadre);
                        return true;
                    }
                } else {
                    if (aux.getIzq() == null) {
                        NodoArbol nodoNuevo = new NodoArbol(datoInsertar);
                        aux.setIzq(nodoNuevo);
                        System.out.println("Se inserto " + datoInsertar + " como hijo izquierdo " + datoPadre);
                        return true;
                    }
                }
            }
        }
        //buscar por ambos lados, comopreorden
        //Ahora, si no retorno, significa que talves tenia un hijo
        //recursividad
        //si mandamos un nodo null lo intentara insertar como raiz
        if (aux.getIzq() != null) {//hay algo
            //si lo inserto ya no tengo que buscar el lado derecho
            if (!insertarNodoExpresion(aux.getIzq(), datoInsertar, datoPadre, lado)) {
                if (aux.getDer() != null) {//hay algo
                    if (!insertarNodoExpresion(aux.getDer(), datoInsertar, datoPadre, lado)) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public int evaluarExpresion(NodoArbol onodo) {
        int valor, valorIzquierdo = 0, valorDerecho = 0;
        //verificar que sea un operador
        char d = onodo.getDato();
        if (d == '+' || d == '-' || d == '*' || d == '/') {
            //Es un operador vuelve a llamar a la funcion
            valorIzquierdo = evaluarExpresion(onodo.getIzq());
            valorDerecho = evaluarExpresion(onodo.getDer());
            //selecciona operación
            switch (onodo.getDato()) {
                case '+':
                    return valorIzquierdo + valorDerecho;

                case '-':
                    return valorIzquierdo - valorDerecho;
                case '*':
                    return valorIzquierdo * valorDerecho;
                case '/':
                    return valorIzquierdo / valorDerecho;
                default:
                    valor = onodo.getDato() - '0';
                    return valor;
            }
        } else {
            valor = onodo.getDato() - '0';
            return valor;
        }
    }

    //ADICIONAL
    public void imprimirPre() {
        imprimirPre(raiz);
        System.out.println();
    }

    private void imprimirPre(NodoArbol reco) {
        if (reco != null) {
            System.out.print(reco.getDato() + " ");
            imprimirPre(reco.getIzq());
            imprimirPre(reco.getDer());
        }
    }

    public void imprimirPost() {
        imprimirPost(raiz);
        System.out.println();
    }

    private void imprimirPost(NodoArbol reco) {
        if (reco != null) {
            imprimirPost(reco.getIzq());
            imprimirPost(reco.getDer());
            System.out.print(reco.getDato() + " ");
        }
    }

}
