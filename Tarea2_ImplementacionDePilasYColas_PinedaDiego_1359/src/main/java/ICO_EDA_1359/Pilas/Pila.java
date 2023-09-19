package ICO_EDA_1359.Pilas;

import ICO_EDA_1359.Nodo;

public class Pila {
    private Nodo cabecera;

    public Pila() {
    }

    public Pila(Nodo cabecera) {
        this.cabecera = cabecera;
    }

    @Override
    public String toString() {
        return "Pila{" +
                "cabecera=" + cabecera +
                '}';
    }
    public void Peek(){
        if (cabecera != null){
            System.out.println("El valor al principio de la pila es: " + cabecera.valor);
        }else{
            System.out.println("Pila vacia.");
        }
    }
    public void Push(Object valor){
        Nodo temp = cabecera;
        if (cabecera == null){
            cabecera = new Nodo(valor);
        }else{
            cabecera = new Nodo(valor, temp);
        }
    }
    public void Pop(){
        Nodo temp = cabecera;
        if (cabecera != null){
            if (cabecera.enlace != null){
                cabecera = temp.enlace;
                temp = null;
            }else{
                cabecera = null;
            }
        }else{
            System.out.println("La pila esta vacia, no hay nada qie borrar.");
        }
    }
}
