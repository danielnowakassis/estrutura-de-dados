

public class FilaCircular {
    private int primeiro;
    private int tamanho;
    private int[] lista;
    private int n = 0;

    public FilaCircular(int tamanho) {
        this.tamanho = tamanho;
        this.lista = new int[tamanho];
        this.n = 0;
        this.primeiro = 0;
    }

    public boolean cheia(){
        if (this.n - this.primeiro == this.tamanho){
            return true;
        }else{
            return false;
        }

    }
    public boolean vazia(){
        if(this.n - this.primeiro == 0){
            return true;
        }else{
            return false;
        }
    }
    public void inserir(int elemento){
        if(!this.cheia()){
            if(this.n > -1){
                int add = (this.n) % this.tamanho;
                lista[add] = elemento;
                this.n = this.n + 1;
            }

        }else{
            System.out.println("Erro na inserção número " + String.valueOf(this.n + 1));
            System.out.println("A lista já está cheia");
        }
    }
    public int remover() {
        int a = 0;
        if(!this.vazia()) {
            a = this.lista[this.primeiro % 4];
            this.primeiro = this.primeiro + 1;
        }
        return a;
    }
    public void imprimir(){
        int inicio, index;
        if(!this.vazia()){
          inicio = this.primeiro % 4;
          System.out.print("[ ");
          for(int i = 0; i < this.n - this.primeiro ; i++){
              index = (i + inicio) % this.tamanho;
              System.out.print(String.valueOf(this.lista[index]) + " ,");
          }
            System.out.print(" ]");
            System.out.println(" ");
        }else{
            System.out.println("A lista está vazia");
        }
    }
}
