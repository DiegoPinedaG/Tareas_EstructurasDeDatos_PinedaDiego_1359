package ICO_EDA_1359.Colas;

import ICO_EDA_1359.Nodo;

public class Cola {
    private Nodo cabecera;
    private Nodo fin;

    public Cola() {
        cabecera = fin = null;
    }

    public Cola(Nodo cabecera) {
        this.cabecera= this.fin = cabecera;
    }

    @Override
    public String toString() {
        return "Cola{" +
                "cabecera=" + cabecera +
                '}';
    }

    public boolean estaVacia(){
        return cabecera == null;
    }
    public void Enqueue(Object val){
        Nodo nuevo = new Nodo(val);
        if(estaVacia()){
            cabecera = nuevo;
        }else{
            fin.enlace = nuevo;
        }
        fin = nuevo;
    }
    public void Peek(){
        if (cabecera != null){
            System.out.println("El valor al principio de la cola es: " + cabecera.valor);
        }else{
            System.out.println("Cola vacia.");
        }
    }
    public void Dequeue(){
        Nodo temp = cabecera;
        if (cabecera != null){
            if (cabecera.enlace != null){
                cabecera = temp.enlace;
                temp = null;
            }else{
                cabecera = null;
            }
        }else{
            System.out.println("La cola esta vacia, no hay nada qie borrar.");
        }
    }
}
