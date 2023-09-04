package ICO_ED_1359.Listas;

import ICO_ED_1359.Nodos.Nodo;

public class ListaS {
    private Nodo cabeza;

    public ListaS() {
    }

    public ListaS(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public String toString() {
        return "ListaS{" +
                "cabeza=" + cabeza +
                '}';
    }
    public void insertar(Object val, int index){
        Nodo temp = this.getCabeza();
        for(int i=1; i<=index; i++){
            if (i == index-1 | temp.getEnlace() == null ){
                if (temp.getEnlace() == null){
                    temp.setEnlace(new Nodo(val));
                }else{
                    temp.setEnlace(new Nodo(val, temp.getEnlace()));
                }
            }else{
                temp = temp.getEnlace();
            }
        }
    }
    public void acceder(int index){
        Nodo temp = this.getCabeza();
        for(int i=1; i<=index ;i++){
            if (i == index) {
                System.out.println("El valor en la posición "+ index + " es: " + temp.getValor());
            }else{
                temp = temp.getEnlace();
            }
        }
    }
    public void borrar(int index){
        Nodo temp = this.getCabeza();
        for(int i=1; i<=index ;i++){
            if (i == index) {
                Object valor = temp.getEnlace().getValor();
                Nodo enlacesalvado = temp.getEnlace().getEnlace();
                temp.setValor(valor);
                temp.setEnlace(enlacesalvado);
            }else{
                temp = temp.getEnlace();
            }
        }
    }
}

