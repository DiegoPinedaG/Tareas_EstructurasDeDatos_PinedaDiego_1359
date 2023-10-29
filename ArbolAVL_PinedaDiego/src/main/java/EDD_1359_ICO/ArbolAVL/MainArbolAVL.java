package EDD_1359_ICO.ArbolAVL;

public class MainArbolAVL {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL(new NodoArbol(15));
        System.out.println(arbol);
        arbol.insertarNormal(10);
        arbol.insertarNormal(5);
        arbol.insertarNormal(13);
        arbol.insertarNormal(1);
        arbol.insertarNormal(6);
        arbol.insertarNormal(17);
        arbol.insertarNormal(16);
        arbol.insertarNormal(7);
        arbol.insertarNormal(4);
        arbol.insertarNormal(100);
        System.out.println("--------------------------------------------------------");
        System.out.println(arbol);
        arbol.eliminar(100);
        arbol.eliminar(5);
        System.out.println("--------------------------------------------------------");
        System.out.println(arbol);
        arbol.eliminar(7);
        System.out.println("--------------------------------------------------------");
        System.out.println(arbol);
        arbol.insertarNormal(19);
    }
}
