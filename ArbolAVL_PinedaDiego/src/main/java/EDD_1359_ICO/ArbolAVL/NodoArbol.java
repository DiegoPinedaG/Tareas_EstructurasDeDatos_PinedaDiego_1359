package EDD_1359_ICO.ArbolAVL;

public class NodoArbol {
    public int valor;
    public NodoArbol enlaceIzquierda;
    public NodoArbol enlaceDerecha;
    public int factorEquilibrio;

    public NodoArbol() {
    }

    public NodoArbol(int valor) {
        this.valor = valor;
        this.factorEquilibrio = 0;
        this.enlaceIzquierda = null;
        this.enlaceDerecha = null;
    }

    @Override
    public String toString() {
        return "NodoArbol{" +
                "valor=" + valor +
                ", enlaceIzquierda=" + enlaceIzquierda +
                ", enlaceDerecha=" + enlaceDerecha +
                '}';
    }
}
