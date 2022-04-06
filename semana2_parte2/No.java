public class No {
    private Integer dado;
    private No proximo;
    private No anterior;
    public No(){
        this.dado = null;
        this.proximo = null;
        this.anterior = null;
    }

    public No(Integer pDado){
        this.dado = pDado;
        this.proximo = null;
        this.anterior = null;
    }


    public Integer getDado() {
        return dado;
    }

    public void setDado(Integer dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }


}
