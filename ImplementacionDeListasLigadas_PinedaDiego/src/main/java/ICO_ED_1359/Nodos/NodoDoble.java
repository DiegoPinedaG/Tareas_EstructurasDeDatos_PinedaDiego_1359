package ICO_ED_1359.Nodos;

public class NodoDoble {
    public Object valor;
    public NodoDoble siguiente;
    public NodoDoble anterior;

    public NodoDoble() {
    }

    public NodoDoble(Object valor) {
        this (valor, null, null);
    }

    public NodoDoble(Object valor, NodoDoble siguiente, NodoDoble anterior) {
        this.valor = valor;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
}
