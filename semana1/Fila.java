public class Fila {
    private int primeiro;
    private int ultimo;
    private int lista[];
    private int tamanho;
    public Fila(int tamanho){
        this.tamanho = tamanho;
        this.primeiro = 0;
        this.ultimo = 0;
        this.lista = new int[tamanho];
    }
    public boolean cheia(){
        return this.ultimo == this.tamanho;
    }
    public boolean vazia(){
        return (this.primeiro == this.ultimo);
    }
    public void inserir(int elemento){
        if(!this.cheia()){
            this.lista[this.ultimo] = elemento;
            this.ultimo += 1;
        }else{
            System.out.println("A Lista está cheia");
        }
    }
    public void retirar(){
        if(!this.vazia() && this.primeiro != this.tamanho){
            this.primeiro += 1;
        }else{
            System.out.println("Não é possivel retirar mais elementos");
        }
    }
    public void imprime(){
        if(!this.vazia()){
        System.out.print("[ ");
        for(int i = this.primeiro; i < this.ultimo; i++){
            System.out.print(String.valueOf(this.lista[i]) + " ,");
        }
        System.out.print(" ]");
        System.out.println(" ");
        }else{
            System.out.println("A lista está vazia");
        }
    }
}
class Main2{
    public static void main(String[] args) {
        Fila f = new Fila(4);
        f.imprime();
        f.inserir(1);
        f.inserir(2);
        f.inserir(3);
        f.imprime();
        f.inserir(4);
        f.inserir(5);
        f.imprime();
        f.retirar();
        f.imprime();
        f.retirar();
        f.retirar();
        f.imprime();
        f.retirar();
        f.imprime();
        f.inserir(2);
    }
}
