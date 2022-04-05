public class Main {
    public static void main(String[] args) throws Exception {

        // Criar uma FilaCircular
        FilaCircular f = new FilaCircular(4);
        /*f.inserir(5);
        f.inserir(5);
        f.inserir(5);
        f.inserir(5);
        f.imprimir();*/



        f.imprimir();
        // Inserir o elemento 5 na fila f
        f.inserir(5);
        f.imprimir();
        // Inserir o elemento 15 na fila f
        f.inserir(15);
        f.imprimir();
        // Inserir o elemento 25 na fila f
        f.inserir(25);
        f.imprimir();
        // Remover elemento da fila f
        System.out.println("Removido: "+f.remover());
        f.imprimir();
        // Remover elemento da fila f
        System.out.println("Removido: "+f.remover());
        f.imprimir();
        // Inserir o elemento 15 na fila f
        f.inserir(15);
        f.imprimir();
        // Inserir o elemento 25 na fila f
        f.inserir(25);
        f.imprimir();
        // Remover elemento da fila f
        System.out.println("Removido: "+f.remover());
        f.imprimir();
    }
}


