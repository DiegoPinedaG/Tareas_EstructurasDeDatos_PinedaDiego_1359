package ICO_ED_1359;

import ICO_ED_1359.Listas.ListaDoble;

public class MainListaDoble {
    public static void main(String[] args) {
        ListaDoble listaD = new ListaDoble();
        listaD.agregarFinal(1);
        listaD.agregarInicio(0);
        listaD.verListaNormal();
        System.out.println("-------------------------------------------------------------------------------");
        listaD.agregarFinal(2);
        listaD.agregarFinal(3);
        listaD.agregarFinal("maria");
        listaD.verListaNormal();
        listaD.verListaAlrevez();
        System.out.println("--------------------------------------------------------------------------------");
        listaD.borrar(2);
        listaD.verListaNormal();
        listaD.verListaAlrevez();
        System.out.println("---------------------------------------------------------------------------------");
        listaD.acceder(3);
    }
}
