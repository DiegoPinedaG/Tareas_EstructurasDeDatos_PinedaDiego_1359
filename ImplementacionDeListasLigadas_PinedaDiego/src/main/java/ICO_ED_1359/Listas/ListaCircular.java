package ICO_ED_1359.Listas;

import ICO_ED_1359.Nodos.NodoCircular;

public class ListaCircular{
    NodoCircular fin;

    public ListaCircular() {
        fin = null;
    }
    public boolean vacia(){
        return fin == null;
    }
    public ListaCircular insertar(Object valor){
        NodoCircular listaNueva = new NodoCircular(valor);
        if (fin != null){
            listaNueva.siguiente = fin.siguiente;
            fin.siguiente = listaNueva;
        }
        fin = listaNueva;
        return this;
    }
    public void verLista(){
        NodoCircular temp = fin.siguiente;
        System.out.println(" ");
        do{
            System.out.println("[" + temp.valor + "]");
            temp = temp.siguiente;
        }while (temp!= fin.siguiente);
    }

    public boolean borrar(Object dato){
        NodoCircular temp = fin;
        boolean res = false;
        while (temp.siguiente != fin &&! res) {
            res = (temp.siguiente.valor == dato);
            if (!res) {
                temp = temp.siguiente;
            }
        }
        res = (temp.siguiente.valor == dato);
        if (res){
            NodoCircular temp2 = temp.siguiente;
            if (fin == fin.siguiente){
                fin = null;
            }else{
                if (temp2 == fin){
                    fin = temp;
                }
                temp.siguiente = temp2.siguiente;
            }
            temp = null;
        }
        return res == true;
    }
    public void acceder(int index){
        NodoCircular temp = fin;
        for (int i=0; i<=index; i++){
            if (i == index){
                System.out.println("El valor en la posición " + index + " es: " + temp.valor);
            }else{
                temp = temp.siguiente;
            }
        }
    }
}
