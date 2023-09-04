package ICO_ED_1359;

import ICO_ED_1359.Listas.ListaCircular;

public class MainListaCircular {
    public static void main(String[] args) {
        ListaCircular listaC = new ListaCircular();
        listaC.insertar(1);
        listaC.insertar(2);
        listaC.insertar(3);
        listaC.insertar("Jose");
        listaC.insertar("Aguacate");
        listaC.insertar(4);
        listaC.insertar(true);
        listaC.verLista();
        System.out.println("------------------------------------------------------------------------");
        listaC.borrar(3);
        listaC.verLista();
        System.out.println("-------------------------------------------------------------------------");
        listaC.acceder(4);
    }
}
