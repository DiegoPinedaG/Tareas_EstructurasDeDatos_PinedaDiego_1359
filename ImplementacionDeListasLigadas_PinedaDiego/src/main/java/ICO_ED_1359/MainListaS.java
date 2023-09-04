package ICO_ED_1359;

import ICO_ED_1359.Listas.ListaS;
import ICO_ED_1359.Nodos.Nodo;

public class MainListaS {
    public static void main(String[] args) {
        ListaS list1 = new ListaS(new Nodo(1));
        list1.insertar(2,2);
        list1.insertar(3,3);
        list1.insertar(4,4);
        list1.insertar(5,5);
        list1.insertar(6,6);
        System.out.println(list1);
        list1.insertar("Maria",4);
        System.out.println(list1);
        System.out.println("----------------------------------------------------------------------------");
        list1.acceder(4);
        list1.insertar("Jose",4);
        System.out.println(list1);
        list1.acceder(4);
        System.out.println("--------------------------------------------------------------------------------");
        list1.borrar(4);
        System.out.println(list1);
        list1.acceder(4);
    }
}