package ICO_ED_1359.Nodos;

public class Nodo {
    public Object valor;
    public Nodo enlace;

    public Nodo() {
    }
    public Nodo(Nodo enlace) {
        this.enlace = enlace;
    }

    public Nodo(Object valor) {
        this.valor = valor;
    }

    public Nodo(Object valor, Nodo enlace) {
        this.valor = valor;
        this.enlace = enlace;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor +
                ", enlace=" + enlace +
                '}';
    }
}
