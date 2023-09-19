package ICO_EDA_1359;

public class Nodo {
    public Object valor;
    public Nodo enlace;

    public Nodo() {
    }

    public Nodo(Object valor) {
        this.valor = valor;
    }

    public Nodo(Object valor, Nodo enlace) {
        this.valor = valor;
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
