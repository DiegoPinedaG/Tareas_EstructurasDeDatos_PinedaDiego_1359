package EDD_1359_ICO.ArbolAVL;

public class ArbolAVL {
    private NodoArbol raiz;

    public ArbolAVL() {
        raiz = null;
    }

    public ArbolAVL(NodoArbol raiz) {
        this.raiz = raiz;
    }

    @Override
    public String toString() {
        return "ArbolAVL{" +
                "raiz=" + raiz +
                '}';
    }

    public NodoArbol buscar (int valor, NodoArbol r){
        if(raiz == null){
            return null;
        }else{
            if (r.valor == valor){
                return r;
            }else{
                if (r.valor < valor){
                    return buscar(valor , r.enlaceDerecha);
                }else{
                    return buscar( valor, r.enlaceIzquierda);
                }
            }
        }
    }
    public int obtenerFE (NodoArbol x){
        if (x == null){
            return -1;
        }else{
            return x.factorEquilibrio;
        }
    }
    public NodoArbol rotacionSimpleIzquierda(NodoArbol y){
        NodoArbol temp = y.enlaceIzquierda;
        y.enlaceIzquierda = temp.enlaceDerecha;
        temp.enlaceDerecha = y;
        y.factorEquilibrio = Math.max(obtenerFE(y.enlaceIzquierda),obtenerFE(y.enlaceDerecha))+1;
        temp.factorEquilibrio = Math.max(obtenerFE(temp.enlaceIzquierda),obtenerFE(temp.enlaceDerecha))+1;
        return temp;
    }
    public NodoArbol rotacionSimpleDerecha(NodoArbol y){
        NodoArbol temp = y.enlaceDerecha;
        y.enlaceDerecha = temp.enlaceIzquierda;
        temp.enlaceIzquierda = y;
        y.factorEquilibrio = Math.max(obtenerFE(y.enlaceIzquierda),obtenerFE(y.enlaceDerecha))+1;
        temp.factorEquilibrio = Math.max(obtenerFE(temp.enlaceIzquierda),obtenerFE(temp.enlaceDerecha))+1;
        return temp;
    }
    public NodoArbol rotacionDobleIzquierda (NodoArbol z){
        NodoArbol temp2;
        z.enlaceIzquierda = rotacionSimpleDerecha(z.enlaceIzquierda);
        temp2 = rotacionSimpleIzquierda(z);
        return temp2;
    }
    public NodoArbol rotacionDobleDerecha (NodoArbol z){
        NodoArbol temp2;
        z.enlaceDerecha = rotacionSimpleDerecha(z.enlaceDerecha);
        temp2 = rotacionSimpleDerecha(z);
        return temp2;
    }
    public NodoArbol insertar(NodoArbol nuevo, NodoArbol subAr){
        NodoArbol nuevaRaiz = subAr;
        if (nuevo.valor < subAr.valor){
            if (subAr.enlaceIzquierda == null){
                subAr.enlaceIzquierda = nuevo;
            }else{
                subAr.enlaceIzquierda = insertar(nuevo , subAr.enlaceIzquierda);
                if ((obtenerFE(subAr.enlaceIzquierda) - obtenerFE(subAr.enlaceDerecha) == 2)){
                    if (nuevo.valor < subAr.enlaceIzquierda.valor){
                        nuevaRaiz = rotacionSimpleIzquierda(subAr);
                    }else{
                        nuevaRaiz = rotacionDobleDerecha(subAr);
                    }
                }
            }
        }else if (nuevo.valor > subAr.valor){
                if (subAr.enlaceDerecha == null){
                    subAr.enlaceDerecha = nuevo;
                }else{
                    subAr.enlaceDerecha = insertar(nuevo, subAr.enlaceDerecha);
                    if ((obtenerFE(subAr.enlaceDerecha)-obtenerFE(subAr.enlaceIzquierda) == 2)){
                        if (nuevo.valor > subAr.enlaceDerecha.valor){
                            nuevaRaiz = rotacionSimpleDerecha(subAr);
                        }else{
                            nuevaRaiz = rotacionDobleDerecha(subAr);
                        }
                    }
                }
        }else {
            System.out.println("El nodo ya existe dentro del árbol");
        }
        if ((subAr.enlaceIzquierda == null && subAr.enlaceDerecha != null)){
            subAr.factorEquilibrio = subAr.enlaceDerecha.factorEquilibrio+1;
        } else if ((subAr.enlaceDerecha == null) && (subAr.enlaceIzquierda != null)) {
            subAr.factorEquilibrio = subAr.enlaceIzquierda.factorEquilibrio+1;
        }else {
            subAr.factorEquilibrio = Math.max(obtenerFE(subAr.enlaceIzquierda), obtenerFE(subAr.enlaceDerecha))+1;
        }
        return nuevaRaiz;
    }
    public void insertarNormal (int dato){
        NodoArbol nuevo = new NodoArbol(dato);
        if (raiz == null){
            raiz = nuevo;
        }else {
            raiz = insertar(nuevo, raiz);
        }
    }
    public boolean eliminar ( int dato){
        NodoArbol temp = raiz;
        NodoArbol padre = raiz;
        boolean caminoIzquierda = true;
        while (temp.valor != dato){
            padre = temp;
            if (dato < temp.valor){
                caminoIzquierda = true;
                temp = temp.enlaceIzquierda;
            }else{
                caminoIzquierda = false;
                temp = temp.enlaceDerecha;
            }
            if (temp == null){
                return false;
            }//fin while
            if (temp.enlaceIzquierda == null && temp.enlaceDerecha == null){
                if (temp == raiz){
                    raiz = null;
                }else if (caminoIzquierda){
                    padre.enlaceIzquierda = null;
                }else{
                    padre.enlaceDerecha = null;
                }
            } else if (temp.enlaceDerecha == null) {
                if (temp == raiz){
                    raiz = temp.enlaceIzquierda;
                }else if (caminoIzquierda){
                    padre.enlaceIzquierda = temp.enlaceIzquierda;
                }else{
                    padre.enlaceDerecha = temp.enlaceIzquierda;
                }
            } else if (temp.enlaceIzquierda == null) {
                if (temp == raiz){
                    raiz = temp.enlaceDerecha;
                }else if (caminoIzquierda){
                    padre.enlaceIzquierda = temp.enlaceDerecha;
                }else{
                    padre.enlaceDerecha = temp.enlaceIzquierda;
                }
            }else{
                NodoArbol reemplazo = obtenerNodoRemplazo(temp);
                if (temp == raiz){
                    raiz = reemplazo;
                }else if (caminoIzquierda){
                    padre.enlaceIzquierda = reemplazo;
                }else{
                    padre.enlaceDerecha = reemplazo;
                }
                reemplazo.enlaceIzquierda = temp.enlaceIzquierda;
            }
        }
        return true;
    }
    public NodoArbol obtenerNodoRemplazo (NodoArbol remp){
        NodoArbol remplazarPadre = remp;
        NodoArbol remplazo = remp;
        NodoArbol temp = remp.enlaceDerecha;
        while (temp != null){
            remplazarPadre = remplazo;
            remplazo = temp;
            temp = temp.enlaceIzquierda;
        }
        if (remplazo != remp.enlaceDerecha){
            remplazarPadre.enlaceIzquierda = remplazo.enlaceDerecha;
            remplazo.enlaceDerecha = remp.enlaceDerecha;
        }
        return remplazo;
    }
}
