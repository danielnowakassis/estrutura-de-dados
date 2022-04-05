class Pilha {
    private int tamanho;
    private int[] lista;
    private int topo;
    public Pilha(int tamanho){
        this.tamanho = tamanho;
        this.lista = new int[tamanho];
        this.topo = -1;
    }
    public boolean cheia(){
        return (this.topo == this.tamanho -1);
    }
    public boolean vazia(){
        return (this.topo == -1);
    }
    public void inserir(int elemento){
        if(!this.cheia()){
        this.topo += 1;
        this.lista[this.topo] = elemento;}
        else{
            System.out.println("A Lista já está cheia");
        }
    }
    public void retirar(){
        if(!this.vazia()){
            this.topo -= 1;
        }else{
            System.out.println("A lista está vazia");
        }
    }
    public void imprime(){
        if(!this.vazia()){
            System.out.print("[ ");
            for(int i = 0; i < this.topo + 1; i++){
                System.out.print(String.valueOf(this.lista[i]) + " ,");
            }
            System.out.print(" ]");
            System.out.println(" ");
        }
        else{
            System.out.println("A Lista está vazia");
        }
    }
}
class Main {
    public static void main(String[] args){
        Pilha p = new Pilha(4);
        p.imprime();
        p.inserir(1);
        p.inserir(2);
        p.imprime();
        p.retirar();
        p.imprime();
        p.inserir(2);
        p.inserir(3);
        p.inserir(4);
        p.imprime();
        p.inserir(5);
        p.imprime();
    }
}

