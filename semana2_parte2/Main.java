public class Main {
    public static void main(String[] args) {
        No n;
        Lista2Encadeada lista = new Lista2Encadeada();
        System.out.println("Inseriu Ultimo 10 ? " + lista.insereUltimo(10));
        System.out.println("Inseriu Ultimo 11 ? " + lista.insereUltimo(11));
        System.out.println("Inseriu Ultimo 12 ? " + lista.insereUltimo(12));
        System.out.println("Inseriu Ultimo 13 ? " + lista.insereUltimo(13));
        System.out.println("Inseriu Ultimo 14 ? " + lista.insereUltimo(14));
        System.out.println("Inseriu Primeiro 9 ? " + lista.inserePrimeiro(9));
        System.out.println("Inseriu Ultimo 16 ? " + lista.insereUltimo(16));

        lista.imprimirInicio2Fim();
        System.out.println();
        lista.imprimirFim2Inicio();

        System.out.println("\nInseriu depois 14 -> 15 ? " +
                lista.insereDepois(new No(14), 15));

        System.out.println("Remove 10 ? " +
                ((n = lista.remove(new No(10))) != null ? n.getDado() : false));
        System.out.println("Remove 100 ? " +
                ((n = lista.remove(new No(100))) != null ? n.getDado() : false));
        System.out.println("Remove ultimo ? " +
                ((n = lista.removeUltimo()) != null ? n.getDado() : false));
        System.out.println("Remove primeiro ? " +
                ((n = lista.removePrimeiro()) != null ? n.getDado() : false));

        lista.imprimirInicio2Fim();
        System.out.println();
        lista.imprimirFim2Inicio();
}
}
