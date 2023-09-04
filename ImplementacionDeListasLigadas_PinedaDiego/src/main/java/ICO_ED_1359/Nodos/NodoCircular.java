package ICO_ED_1359.Nodos;

public class NodoCircular{
    public Object valor;
    public NodoCircular siguiente;

    public NodoCircular() {
    }
    public NodoCircular(Object val){
        valor = val;
        siguiente = this;
    }
    public NodoCircular(Object valor, NodoCircular siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
}
