package ICO_EDA_1359.Colas;

import ICO_EDA_1359.Nodo;

public class MainCola {
    public static void main(String[] args) {
        System.out.println("________________________COLA SIN VALORES INICIALES__________________________________");
        Cola cola1 = new Cola();
        cola1.Peek();
        System.out.println("_______________________________Método Enqueue_______________________________________");
        cola1.Enqueue("Hola");
        cola1.Peek();
        System.out.println(cola1);
        cola1.Enqueue(123);
        System.out.println(cola1);
        cola1.Enqueue("Juan");
        System.out.println(cola1);
        cola1.Enqueue("Maria");
        System.out.println(cola1);
        System.out.println("_______________________________Método Dequeue_______________________________________");
        cola1.Dequeue();
        cola1.Peek();
        System.out.println(cola1);
        cola1.Dequeue();
        cola1.Peek();
        System.out.println(cola1);
        cola1.Dequeue();
        cola1.Peek();
        System.out.println(cola1);
        cola1.Dequeue();
        cola1.Peek();
        System.out.println(cola1);
        System.out.println("________________________COLA CON VALORES INICIALES__________________________________");
        Cola cola2 = new Cola(new Nodo("Diego"));
        cola2.Peek();
        System.out.println("_______________________________Método Enqueue_______________________________________");
        cola2.Enqueue("Hola");
        cola2.Peek();
        System.out.println(cola2);
        cola2.Enqueue(123);
        System.out.println(cola2);
        cola2.Enqueue("Juan");
        System.out.println(cola2);
        cola2.Enqueue("Maria");
        System.out.println(cola2);
        System.out.println("_______________________________Método Dequeue_______________________________________");
        cola2.Dequeue();
        cola2.Peek();
        System.out.println(cola2);
        cola2.Dequeue();
        cola2.Peek();
        System.out.println(cola2);
        cola2.Dequeue();
        cola2.Peek();
        System.out.println(cola2);
        cola2.Dequeue();
        cola2.Peek();
        System.out.println(cola2);
    }
}
